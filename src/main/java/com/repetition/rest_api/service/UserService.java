package com.repetition.rest_api.service;

import com.repetition.rest_api.model.User;
import com.repetition.rest_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    // wypisz wszystkich użytkowników
    public List<User> getUsers(){
        return userRepository.findAll();
    }
    // wyszykaj użytkownika po id
    public User getUser(long id){
        return userRepository.getOne(id);
    }
    // utwórz nowego użytkownika
    public void createUser(User user){
        userRepository.save(user);
    }
    // edytuj użytkownika
    public void updateUser(User user){
        userRepository.save(user);
    }
    // usuń użytkownika po id
    public void deleteUser(long id){
        userRepository.deleteById(id);
    }
}
