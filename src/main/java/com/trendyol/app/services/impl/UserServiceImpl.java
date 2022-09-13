package com.trendyol.app.services.impl;

import com.trendyol.app.dto.UserDto;
import com.trendyol.app.entity.User;
import com.trendyol.app.repositories.UserRepository;
import com.trendyol.app.services.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Logger;

import static org.apache.logging.log4j.util.Strings.isEmpty;

/*
* BU katmanda entity-dto transferi yapılır
* bu katman controllerda cagırılır, repository degil!
* */

@Service
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;

    //final oldugu ıcın gerekıyor
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDto save(UserDto userDto) {

            User user = new User();
            user.setName(userDto.getName());
            user.setUser_id(userDto.getUser_id());
            user.setPassword(userDto.getPassword());
            user.setEmail(userDto.getEmail());
            userRepository.save(user);
            return userDto;

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Long id, UserDto updatedUser) {

    }

    @Override
    public ArrayList<UserDto> userDto() {
        return null;
    }
}
