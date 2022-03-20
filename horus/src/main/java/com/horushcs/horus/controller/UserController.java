package com.horushcs.horus.controller;

import com.horushcs.horus.model.User;
import com.horushcs.horus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

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
    public List<User> getAllStudents(){
        return userService.getAllUsers();
    }

    @GetMapping("/test")
    public List<User> test(){
        return userService.getAllUsers();
    }
}
