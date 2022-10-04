package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.User;

public interface UserRepository extends MongoRepository<User, String> {
	 
	Optional<User> findByName(String name);
	
	Boolean existsByName(String name);
}
