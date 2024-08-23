package com.kitapp.kitapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class usersService {

    @Autowired
    private com.kitapp.kitapp.usersRepository usersRepository;

    public List<users> getAllUsers() {
        return usersRepository.findAll();
    }

    public users create(users user){
        return usersRepository.save(user);
    }
}