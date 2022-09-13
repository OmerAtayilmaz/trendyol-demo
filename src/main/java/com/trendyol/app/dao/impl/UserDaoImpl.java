package com.trendyol.app.dao.impl;

import com.trendyol.app.dao.UserDao;
import com.trendyol.app.dto.UserDto;

import java.util.ArrayList;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean create(UserDto userDto) {
        return false;
    }

    @Override
    public UserDto update(Long userId, UserDto updatedData) {
        return null;
    }

    @Override
    public UserDto getById(Long userId) {
        return null;
    }

    @Override
    public ArrayList<UserDto> getAllUsers() {
        return null;
    }
}
