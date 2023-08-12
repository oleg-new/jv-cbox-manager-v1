package com.olegnew.jvcboxmanagerv1.service;

import com.olegnew.jvcboxmanagerv1.model.Role;

public interface RoleService {
    Role create(Role role);

    Role findRoleByRoleName(Role.RoleName rolName);
}
