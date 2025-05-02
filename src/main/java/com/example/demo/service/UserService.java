package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.model.User;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repo.UserRepo;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    public List<UserDTO> getAllUser(){
        List<User> users = userRepo.findAll();
        System.out.println("get users request received - userService");
        return modelMapper.map(users, new TypeToken<List<UserDTO>>() {}.getType());
    }

    public UserDTO createUser(UserDTO userDTO) {
        User savedUser = userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }

    public UserDTO updateUser(UserDTO userDTO) {
        User savedUser = userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }

    public String deleteUser(UserDTO userDTO) {
        userRepo.delete(modelMapper.map(userDTO, User.class));
        return "User deleted";
    }
}
