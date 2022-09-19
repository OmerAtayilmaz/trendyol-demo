package com.trendyol.app.user.services;

import com.trendyol.app.dto.UserDto;

import java.util.ArrayList;

public interface UserService {
    UserDto save(UserDto userDto);
    void delete(Long id);
    UserDto update(Long id,UserDto updatedUser);
    ArrayList<UserDto> getAllUsers();
    UserDto findById(Long id);

    ArrayList<UserDto> getUsersFromQuery();
}
