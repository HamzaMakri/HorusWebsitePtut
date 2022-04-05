package com.horushcs.horus.service;

import com.horushcs.horus.model.User;
import com.horushcs.horus.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{


    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findUserByLogs(String email, String password) {
        return userRepository.findUserByLogs(email, password);
    }

    @Override
    public void deleteByUserId(Long id){
        userRepository.deleteByUserId(id);
    }
}
