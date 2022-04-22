package com.horushcs.horus.service;

import com.horushcs.horus.model.Role;
import com.horushcs.horus.model.User;
import com.horushcs.horus.repository.RoleRepository;
import com.horushcs.horus.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

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

    @Override
    public void updateUser(User user){
        userRepository.updateInfo(user.getFirst_name(), user.getLast_name(), user.getEmail(), user.getUser_id());
        userRepository.resetUserRoles(user.getUser_id());

        if (!user.getPassword().equals("")){
            userRepository.updateUserPswd(user.getUser_id(), user.getPassword());
        }

        for (Role role : user.getRoles()) {
            userRepository.updateUserRoles(roleRepository.findByName(role.getName()).get().getRole_id(), user.getUser_id());
        }
    }

}
