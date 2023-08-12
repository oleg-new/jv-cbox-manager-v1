package com.olegnew.jvcboxmanagerv1.repository;

import com.olegnew.jvcboxmanagerv1.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findRoleByRoleName(Role.RoleName rolName);
}

