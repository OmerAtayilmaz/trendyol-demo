package com.trendyol.app.services;

import com.trendyol.app.dto.UserDto;
import com.trendyol.app.repositories.UserRepository;

import java.util.ArrayList;

public interface UserService {
    UserDto save(UserDto userDto);
    void delete(Long id);
    void update(Long id,UserDto updatedUser);
    ArrayList<UserDto> userDto();
}
