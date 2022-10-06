package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.UserService;
import com.example.demo.entity.User;
import com.example.demo.exceptions.NoRecordFoundException;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;
	

	@GetMapping("/")
	public String home() {
		return ("<h1>Welcome ss</h1>");
	}
	
	@PostMapping("/registration")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@GetMapping("/getusers")
	public List<User> getUser() {
		return userService.allUser();
	}
	
	@GetMapping("/finduser/{name}")
	public ResponseEntity<User> getUserByName(@PathVariable("name") String name) throws NoRecordFoundException {
		return new ResponseEntity<User>(userService.findUserById(name), HttpStatus.OK);
	}

}
