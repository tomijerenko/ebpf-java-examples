package com.example.api;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;

@RestController
public class UserController {
    
    private static List<User> users = new ArrayList<>();
    
    @GetMapping("/users")
    public List<User> getUsers() {
        return users;
    }
    
    @PostMapping("/user")
    public User addUser(@RequestBody User user) {
        User newUser = new User(user.getUsername());
        users.add(newUser);
        return newUser;
    }
    
    @PutMapping("/user")
    public User setUserBalance(@RequestBody User user) {
        User currUser = users.stream()
                .filter(u -> u.getUsername().equals(user.getUsername()))
                .findFirst()
                .orElse(null);
        
        if (user != null) {
            currUser.setBalance(user.getBalance());
        }
        return currUser;
    }
}
