package com.example.demo.Service;

import java.util.List;

import com.example.demo.payloids.UserDto;

public interface UserService {

	UserDto createUser(UserDto user);

	UserDto updateUser(UserDto user, String userId);

	UserDto getUserById(String userId);

	List<UserDto> getAllUsers();

	void deleateUser(String userId);
}
