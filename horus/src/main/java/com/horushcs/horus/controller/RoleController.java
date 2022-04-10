package com.horushcs.horus.controller;

import com.horushcs.horus.model.Role;
import com.horushcs.horus.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/getAll")
    public List<Role> getAll() {
        return roleService.getAllRoles();
    }

    @GetMapping("/getPermissions")
    @ResponseBody
    public List<String> getPermissions(@RequestParam String roleName){
        return roleService.getPermissions(roleName);
    }


}
