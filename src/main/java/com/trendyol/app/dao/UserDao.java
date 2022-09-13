package com.trendyol.app.dao;

import com.trendyol.app.dto.UserDto;

import java.util.ArrayList;

public interface UserDao {
    boolean create(UserDto userDto);
    UserDto update(Long userId,UserDto updatedData);
    UserDto getById(Long userId);
    ArrayList<UserDto> getAllUsers();
}
