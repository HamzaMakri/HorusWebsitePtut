package com.horushcs.horus.service;

import com.horushcs.horus.model.Permission;
import com.horushcs.horus.model.Role;
import com.horushcs.horus.model.User;
import com.horushcs.horus.repository.RoleRepository;
import com.horushcs.horus.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{


    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<String> getPermissions(String roleName){
        return roleRepository.getPermissions(roleName);
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

}
