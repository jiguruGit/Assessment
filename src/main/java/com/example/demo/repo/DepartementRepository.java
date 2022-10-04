package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Department;

public interface DepartementRepository extends MongoRepository<Department, String>{

}
