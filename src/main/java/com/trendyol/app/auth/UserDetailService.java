package com.trendyol.app.auth;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UserDetailService implements UserDetailsService {
    private Map<String,String > users=new HashMap<>();

    @PostConstruct
    public void init(){
        users.put("temelt","123");
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if(users.containsKey(username)){
            return new User(username,users.get("username"),new ArrayList<>());
        }
        throw new UsernameNotFoundException("There is no user with provided token");
    }
}
