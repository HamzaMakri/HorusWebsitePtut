package com.horushcs.horus.service;

import com.horushcs.horus.model.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUsers();
}
