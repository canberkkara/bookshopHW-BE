package com.kitapp.kitapp;

import com.kitapp.kitapp.users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class usersController {

    @Autowired
    private com.kitapp.kitapp.usersService usersService;

    @GetMapping("/api/users")
    public List<users> getAllUsers() {
        return usersService.getAllUsers();
    }

    @PostMapping("/api/adduser")
    public users saveUser(@RequestBody users user){
        return usersService.create(user);
    }
}