package com.trendyol.app.controller;

import com.trendyol.app.dto.UserDto;
import com.trendyol.app.entity.User;
import com.trendyol.app.exceptions.ApiErrors;
import com.trendyol.app.exceptions.ExceptionHandler;
import com.trendyol.app.repositories.UserRepository;
import com.trendyol.app.services.UserService;
import com.trendyol.app.validations.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.ResponseErrorHandler;

import java.util.Objects;

@Controller
@RequestMapping("/api/v1/")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("/user")
    public ResponseEntity<UserDto> helloWorld(@RequestBody UserDto userDto){
        userService.save(userDto);
        return ResponseEntity.ok(userDto);
    }

//    @PostMapping
//    public ResponseEntity<Create>

}
