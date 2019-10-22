package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {


    @Autowired
    UserRepository userRepository;

    @GetMapping("/hello")
    public List<User> getData(){
        System.out.println("yes2");
        return userRepository.findAll();
    }

    @PostConstruct
    public void saveUser(){
        List<User> users= new ArrayList<>();
        users.add(new User(1,"Ayush"));
        users.add(new User(2,"Abhishek"));
        users.add(new User(3,"Varun"));
        users.add(new User(4,"Vikesh"));
        userRepository.saveAll(users);
    }

//    @GetMapping("/te")

//    @GetMapping("/getUsers")
//    public List<User> getUsers(){
//        System.out.println("yes");
//    }

}
