package com.trendyol.app.dto;



public class UserDto {

    private Long user_id;

    private String email;

    private String name;

    private String password;

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserDto(Long user_id, String email, String name, String password) {
        this.user_id = user_id;
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public UserDto() {
    }
}
