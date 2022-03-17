package com.horushcs.horus.controller;

import com.horushcs.horus.model.User;
import com.horushcs.horus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public String add(@RequestBody User user){
        userService.saveUser(user);
        return "New User is Added";
    }

    @GetMapping("/getAll")
    public List<User> getAllStudents(){
        return userService.getAllUsers();
    }

    @GetMapping("/test")
    public List<User> test(){
        return userService.getAllUsers();
    }
}
