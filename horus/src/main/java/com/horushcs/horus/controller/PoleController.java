package com.horushcs.horus.controller;

import com.horushcs.horus.model.Pole;
import com.horushcs.horus.service.PoleService;
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
@RequestMapping("/api/pole")
public class PoleController {
    

    @Autowired
    private PoleService poleService;

    @GetMapping("/getAll")
    @ResponseBody
    public List<Pole> getAllPoles(){
        return poleService.getAllPoles();
    }





}
