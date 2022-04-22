package com.horushcs.horus.service;

import com.horushcs.horus.model.Permission;
import com.horushcs.horus.model.Role;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RoleService {
    List<String> getPermissions(String roleName);
    public List<Role> getAllRoles();
    public void deleteByRoleId(Long id);
    public void saveRole(Role role);

}
