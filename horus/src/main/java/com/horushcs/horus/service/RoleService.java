package com.horushcs.horus.service;

import com.horushcs.horus.model.Permission;
import com.horushcs.horus.model.User;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RoleService {
    List<String> getPermissions(String roleName);
}
