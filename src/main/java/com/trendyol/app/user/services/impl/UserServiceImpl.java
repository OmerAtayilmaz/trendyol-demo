package com.trendyol.app.user.services.impl;

import com.trendyol.app.dto.UserDto;
import com.trendyol.app.entity.User;
import com.trendyol.app.repositories.UserRepository;
import com.trendyol.app.user.services.UserService;
import com.trendyol.app.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

/*
* BU katmanda entity-dto transferi yapılır
* bu katman controllerda cagırılır, repository degil!
* */

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private final UserRepository userRepository;

    //final oldugu ıcın gerekıyor
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDto save(UserDto userDto) {

            User user = new User();
            user.setName(userDto.getName());
            user.setId(userDto.getId());
            user.setPassword(Utils.hashingPassword(userDto.getPassword()));
            user.setStatus(userDto.getStatus());
            user.setEmail(userDto.getEmail());
            userRepository.save(user);
            return userDto;

    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserDto update(Long id, UserDto updatedUser) {
        User user = userRepository.findById(id).orElse(null);
        if(Objects.isNull(user))
             throw new NullPointerException("AWESOME CUSTOM ERROR: NOO!");

        if(!Objects.isNull(updatedUser.getName())&&!updatedUser.getName().equals(""))
            user.setName(updatedUser.getName());
        if(!Objects.isNull(updatedUser.getPassword())&&!updatedUser.getPassword().equals(""))
            user.setPassword(Utils.hashingPassword(updatedUser.getPassword()));
        if(!Objects.isNull(updatedUser.getEmail())&&!updatedUser.getEmail().equals(""))
            user.setEmail(updatedUser.getEmail());
        if(!Objects.isNull(updatedUser.getStatus())&&!updatedUser.getStatus().equals(""))
            user.setStatus(user.getStatus());
        userRepository.save(user);
        return updatedUser;
    }

    @Override
    public ArrayList<UserDto> getAllUsers() {
        ArrayList<UserDto> userDtoArrayList=new ArrayList<>();
        for (User u:userRepository.findAll()){
            UserDto userDto=new UserDto();
            userDto.setId(u.getId());
            userDto.setPassword(u.getPassword());
            userDto.setName(u.getName());
            userDto.setEmail(u.getEmail());
            userDto.setStatus(u.getStatus());
            userDtoArrayList.add(userDto);
        }
        return userDtoArrayList;
    }

    @Override
    public UserDto findById(Long id) {
        User user=userRepository.findById(id).orElse(null);
        final UserDto userDto =new UserDto();

        if(Objects.isNull(user))
            return null;

        userDto.setEmail(user.getEmail());
        userDto.setName(user.getName());
        userDto.setPassword(user.getPassword());
        userDto.setStatus(user.getStatus());
        userDto.setId(user.getId());
        return userDto;
    }

    @Override
    public ArrayList<UserDto> getUsersFromQuery() {
        ArrayList<UserDto> userDtoArrayList=new ArrayList<>();
        for (User u:userRepository.getUserListFromQuery()){
            UserDto userDto=new UserDto();
            userDto.setId(u.getId());
            userDto.setPassword(u.getPassword());
            userDto.setName(u.getName());
            userDto.setEmail(u.getEmail());
            userDto.setStatus(u.getStatus());
            userDtoArrayList.add(userDto);
        }
        return userDtoArrayList;
    }
}
