package com.trendyol.app.controller;

import com.trendyol.app.dto.UserDto;
import com.trendyol.app.repositories.UserRepository;
import com.trendyol.app.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/api/v1/")
@RestController
@CrossOrigin("*")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @PostMapping("/user")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
        userService.save(userDto);
        return ResponseEntity.ok(userDto);
    }

    @GetMapping("/user")
    public ResponseEntity<ArrayList<UserDto>> allUsers(){
       return ResponseEntity.ok(userService.getAllUsers());
    }

    @GetMapping("user/{id}")
    public ResponseEntity<UserDto> findUserById(@PathVariable Long id){
        return ResponseEntity.ok(userService.findById(id));
    }

    @PostMapping("user/{id}")
    public ResponseEntity<UserDto> updateUser(
            @PathVariable Long id,
            @RequestBody UserDto updateUser
    ){
        return ResponseEntity.ok(userService.update(id,updateUser));
    }

    @GetMapping("/user-sorted")
    public ArrayList<UserDto> userDtos(){
        return userService.getUsersFromQuery();
    }

    @RequestMapping(value="/user/{id}",method=RequestMethod.DELETE)
    public ResponseEntity deleteUser(@PathVariable Long id){
        userService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("DELETED GRACEFULLY");

    }

}
