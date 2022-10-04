package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.User_types;

public interface RoleRepository extends MongoRepository<User_types, String> {

	Optional<User_types> findByName(String user_type_name);

}
