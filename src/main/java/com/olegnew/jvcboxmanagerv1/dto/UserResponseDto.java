package com.olegnew.jvcboxmanagerv1.dto;

import com.olegnew.jvcboxmanagerv1.model.Role;
import java.util.Set;
import lombok.Data;

@Data
public class UserResponseDto {
    private String id;
    private String name;
    private Set<Role> roles;
}
