package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController

public class UserController {

    @Autowired
    UserService userService;




    @GetMapping(value = "/addNewUser")
    public void addNewUser() {
        for (int i =3;i<100;i++)        {

            UserEntity userEntity = new UserEntity();
        userEntity.country = "USA";
        userEntity.name = "Ivan";
        Random random = new Random();
        //userEntity.id = random.nextInt(1000);
            userEntity.id=i;
            userRepository.save(userEntity);
        }
    }

    @GetMapping(value = "deleteUserAll")
    public void deleteUserAll(@RequestParam(name = "id")String id){
       int intId = Integer.parseInt(id);
       userRepository.deleteById(intId);
    }



}
