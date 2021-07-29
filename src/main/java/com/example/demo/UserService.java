package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional//если какой то метод начнет запускаться с серидины, то все откатится назад
public class UserService {
    @Autowired
    UserRepository userRepository;


    public List<UserEntity> getAllUsers() {
        return (List<UserEntity>) userRepository.findAll();
    }
    
}
