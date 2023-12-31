package com.olegnew.jvcboxmanagerv1.controller;

import com.olegnew.jvcboxmanagerv1.dto.CboxResponseDto;
import com.olegnew.jvcboxmanagerv1.dto.FullInformationRequestDto;
import com.olegnew.jvcboxmanagerv1.dto.FullInformationResponseDto;
import com.olegnew.jvcboxmanagerv1.model.cbox.Cbox;
import com.olegnew.jvcboxmanagerv1.model.cbox.FullInformation;
import com.olegnew.jvcboxmanagerv1.service.cbox.CboxService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/cbox")
@RequiredArgsConstructor
@Tag(name = "Cbox Controller", description = "The controller allows you to create, modify, "
        + "reboot, delete a Cbox.\n Allows you to get a list of all Cboxs, get a user by ID.\n +"
        + " Контроллер позволяет создавать, изменять, перезагрузить, удалять Cbox.\n"
        + "Позволяет получить список всех Cbox, получить Cbox по ID")
public class CboxController {
    private final CboxService cboxService;
    private final ModelMapper modelMapper;

    @Operation(summary = "Gets all Cboxs", tags = "Cbox Controller")
    @Schema(title = "List all Cboxs")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "List all Cboxs",
                    content = {
                            @Content(
                                    mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation =
                                            CboxResponseDto.class)))
                    })
    })
    @GetMapping("/")
    public List<CboxResponseDto> getAllCbox() {
        List<Cbox> cboxes = cboxService.getAllCboxs();
        List<CboxResponseDto> cboxResponseDtoList = cboxes.stream()
                .map(u -> modelMapper.map(u, CboxResponseDto.class))
                .collect(Collectors.toList());
        return cboxResponseDtoList;
    }

    @Operation(summary = "Get Cbox by ID", tags = "Cbox Controller")
    @Schema(title = "Get Cbox by ID")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Found Cbox by Id",
                    content = {
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation =
                                            FullInformationResponseDto.class))
                    })
    })
    @GetMapping("/{id}")
    public FullInformationResponseDto getById(@PathVariable
                                                  @RequestParam(name = "Cbox_ID",
                                                          required = true)
                                                  @Parameter(
                                                          description = "ID of the Cbox  "
                                                                  + "you are looking for",
                                                          example = "1")
                                                  Long id) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        // only the OERATOR can get information about the "community"
        boolean hasOperatorRole = authentication.getAuthorities().stream()
                .anyMatch(r -> r.getAuthority().equals("ROLE_OPERATOR"));
        System.out.println(hasOperatorRole);
        return modelMapper.map(cboxService.getFullInformation(id, hasOperatorRole),
                FullInformationResponseDto.class);
    }

    @Operation(summary = "Adding a new Cbox", tags = "Cbox Controller")
    @Schema(title = "Adding a new Cbox")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Data other than default Cbox, street, house,"
                            + " {list of values received from device}",
                    content = {
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation =
                                            FullInformationResponseDto.class))
                    }),
            @ApiResponse(responseCode = "400", description =
                    "Invalid Cbox parameter", content = @Content),
            @ApiResponse(responseCode = "404", description =
                    "No Cbox found", content = @Content)
    })
    @PostMapping("/add")
    public FullInformationResponseDto add(
            @RequestBody
            @Parameter(
                    description = "Data other than default Cbox"
                            + ", street, house,"
                            + "{list of values to be "
                            + "set on the device}",
                    required = true,
                    content = @Content(
                            schema = @Schema(implementation =
                                    FullInformationRequestDto.class)))
            FullInformationRequestDto
                    fullInformationRequestDto) {
        FullInformation fullInformation = modelMapper.map(fullInformationRequestDto,
                FullInformation.class);
        return modelMapper.map(cboxService.add(fullInformation),FullInformationResponseDto.class);
    }

    @Operation(summary = "Reboot Cbox by ID", tags = "Cbox Controller")
    @Schema(title = "Reboot Cbox by ID")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Ok",
                    content = {
                            @Content(
                                    mediaType = "application/json"),
                    })
    })
    @PostMapping("/reboot")
    public String reboot(@RequestParam(
                                     name = "Cbox_ID",
                                     required = true)
                         @Parameter(
                                     description = "ID of the Cbox to be Rebooted",
                                     example = "2")
                             Long id) {
        Cbox cbox = cboxService.getById(id).get();
        cboxService.rebootDevice(cbox);
        return "Rebooting";
    }

    @Operation(summary = "Update Cbox by ID", tags = "Cbox Controller")
    @Schema(title = "Update Cbox by ID")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Updated Cbox data, street, house, "
                            + "{list of values received from device}",
                    content = {
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation =
                                            FullInformationResponseDto.class))
                    })
    })
    @PatchMapping("/update/{id}")
    public FullInformationResponseDto update(
            @Valid
            @RequestParam(
                    name = "Cbox_ID",
                    required = true)
            @Parameter(description = "ID of the Cbox "
                    + "to be upated",
                    example = "2")Long id,
            @RequestBody
            @Parameter(
                    description = "Updated Data other "
                            + "than current Cbox, street, house,"
                            + " {list of values to be "
                            + "set on the device}",
                    required = true,
                    content = @Content(
                            schema = @Schema(implementation =
                                    FullInformationRequestDto.class)))
            FullInformationRequestDto
                    fullInformationRequestDto) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        // only the OERATOR can get information about the "community"
        boolean hasOperatorRole = authentication.getAuthorities().stream()
                .anyMatch(r -> r.getAuthority().equals("ROLE_OPERATOR"));
        cboxService.updateById(id, modelMapper.map(fullInformationRequestDto,
                FullInformation.class), false);
        return modelMapper.map(cboxService.getFullInformation(id, hasOperatorRole),
                FullInformationResponseDto.class);
    }

    @Operation(summary = "Delete Cbox by ID", tags = "Cbox Controller")
    @Schema(title = "Delete Cbox by ID")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Ok",
                    content = {
                            @Content(
                                    mediaType = "application/json"),
                    })
    })
    @DeleteMapping("/{id}")
    public void delete(@RequestParam(
                                   name = "Cbox_ID",
                                   required = true)
                       @Parameter(
                                   description = "ID of the Cbox to be deleted",
                                   example = "2")
                           Long id) {
        cboxService.delete(id);
    }
}
