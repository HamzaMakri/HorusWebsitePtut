package com.horushcs.horus.controller;

import com.horushcs.horus.model.User;
import com.horushcs.horus.payload.request.SignupRequest;
import com.horushcs.horus.payload.request.UpdateRequest;
import com.horushcs.horus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public String add(@RequestBody User user){
        userService.saveUser(user);
        return "New User is Added";
    }

    @PostMapping("/checkLogin")
    @ResponseBody
    public ResponseEntity<Object> checkLogs(@RequestBody User user){
        try {
            User us = new User();
            us = userService.findUserByLogs(user.getEmail(),user.getPassword());
            if (us.getEmail().equals(user.getEmail())){
                return new ResponseEntity<Object>(us, HttpStatus.OK);
            }else{
                throw new Exception();
            }
        } catch(Exception ex) {
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasAuthority('president')")
    @Transactional
    public String deleteUser(@PathVariable("id") Long id) {
        System.out.println("bonjour =========== " + id);
        userService.deleteByUserId(id);
        return "User Content.";
    }

    @PutMapping("/update/{id}")
    @PreAuthorize("hasAuthority('president')")
    @Transactional
    public String updateUser(@Valid @RequestBody UpdateRequest updateRequest, @PathVariable("id") Long id) {
        System.out.println("========================iisisisisisis==============================================");
        System.out.println(updateRequest.getEmail());
        //userService.deleteByUserId(id);
        return "User Content.";
    }




}
