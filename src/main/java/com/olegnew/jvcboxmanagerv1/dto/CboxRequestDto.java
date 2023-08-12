package com.olegnew.jvcboxmanagerv1.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CboxRequestDto {
    @NotBlank
    @Size(min = 2)
    private String street;
    @NotBlank
    @Size(min = 1)
    private String house;
    @NotBlank
    @Size(min = 7)
    @Pattern(regexp = "^((25[0-5]|(2[0-4]|1[0-9]|[1-9]|)[0-9])(\\.(?!$)|$)){4}$")
    private String ipAddress;
}
