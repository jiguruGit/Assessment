package com.example.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Department;

public interface DepartementRepository extends MongoRepository<Department, String>{

}
