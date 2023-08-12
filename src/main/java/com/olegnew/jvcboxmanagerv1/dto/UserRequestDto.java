package com.olegnew.jvcboxmanagerv1.dto;

import com.olegnew.jvcboxmanagerv1.model.Role;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.util.Set;
import lombok.Data;

@Data
public class UserRequestDto {
    @NotBlank
    @Size(min = 2, max = 32, message = "Name min = 2, max = 3200")
    private String name;
    @NotBlank
    @Size(min = 2, max = 64)
    private String password;
    private Set<Role> roles;
}
