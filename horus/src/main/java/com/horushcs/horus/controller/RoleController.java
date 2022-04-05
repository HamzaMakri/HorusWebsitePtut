package com.horushcs.horus.controller;

import com.horushcs.horus.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
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
    @GetMapping("/all")
    public String allAccess() {
        return "PubContent.";
    }

    @Autowired
    private RoleService roleService;

    @GetMapping("/getPermissions")
    @ResponseBody
    public List<String> getPermissions(@RequestParam String roleName){
        System.out.println("ici ==============================");
        return roleService.getPermissions(roleName);
    }





}
