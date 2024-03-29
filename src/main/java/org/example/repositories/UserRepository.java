package org.example.repositories;

import org.example.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends CrudRepository<User, Integer>{
    User findByUsername(String username);
    
    User findByEmail(String email);
    
}
