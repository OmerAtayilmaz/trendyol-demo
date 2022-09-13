package com.trendyol.app.services;

import com.trendyol.app.dto.UserDto;
import com.trendyol.app.entity.User;

import java.util.ArrayList;
import java.util.List;

public interface UserService {
    UserDto save(UserDto userDto);
    void delete(Long id);
    UserDto update(Long id,UserDto updatedUser);
    ArrayList<UserDto> getAllUsers();
    UserDto findById(Long id);
}
