package com.trendyol.app.repositories;

import com.trendyol.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface UserRepository extends JpaRepository<User,Long> {

    @Query("SELECT u FROM User u ORDER BY u.name")
    ArrayList<User> getUserListFromQuery();
}
