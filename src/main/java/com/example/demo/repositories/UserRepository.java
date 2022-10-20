package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Users;

public interface UserRepository extends MongoRepository<Users, String> {
	
	
	public  Optional<Users> findByName(String name);
	

}
