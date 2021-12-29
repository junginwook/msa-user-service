package com.example.project.service;

import com.example.project.dto.UserDto;
import com.example.project.jpa.UserEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    void createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);

    UserDto getUserDetailsByEmail(String email);

    Iterable<UserEntity> getUserByAll();
}
