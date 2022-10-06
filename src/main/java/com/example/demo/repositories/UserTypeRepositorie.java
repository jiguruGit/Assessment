package com.example.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User_types;
@Repository
public interface UserTypeRepositorie extends MongoRepository<User_types,String>{

}
