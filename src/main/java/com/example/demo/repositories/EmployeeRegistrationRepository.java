package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Employee;

public interface EmployeeRegistrationRepository extends MongoRepository<Employee, String> {

}
