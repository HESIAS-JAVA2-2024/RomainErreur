package org.example.services;

import org.example.entities.User;
import org.example.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    private final UserRepository userRepository;
    
    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public void persistUser(User u){
        userRepository.save(u);
    }
    
    public User findByUsername(String username){
        return userRepository.findByUsername(username);
    }
    
    public User findByEmail(String email){
        return userRepository.findByEmail(email);
    }
    
    public void deleteUserById(int id){
        userRepository.deleteById(id);
    }
}
