package com.horushcs.horus.service;

import com.horushcs.horus.model.User;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUsers();
    public User findUserByLogs(String email, String password);
    public void deleteByUserId(Long id);
    public void updateUser(User user);

}
