/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.horushcs.horus.service;

import com.horushcs.horus.model.Pole;
import com.horushcs.horus.repository.PoleRepository;
import com.horushcs.horus.repository.RoleRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hikhl
 */
@Service
public class PoleServiceImpl implements PoleService {
    
     @Autowired
    private PoleRepository poleRepository;

    @Override
    public List<Pole> getAllPoles(){
        return poleRepository.findAll();
    }

}
