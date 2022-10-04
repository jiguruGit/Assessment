package com.example.demo.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;

import com.example.demo.Service.UserService;
import com.example.demo.entity.User;
import com.example.demo.exceptions.ResourceNotFoundException;
import com.example.demo.payloids.UserDto;
import com.example.demo.repositories.UserRepository;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDto createUser(UserDto userDto) {

		User user = this.dtoToUser(userDto);

		User saveUser = this.userRepository.save(user);

		return this.userToUserDto(saveUser);
	}

	@Override
	public UserDto updateUser(UserDto userDto, String userId) {
		User user = this.userRepository.findById(userId)
				.orElseThrow(()-> new ResourceNotFoundException("User","id",userId));
		return null;
	}

	@Override
	public UserDto getUserById(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleateUser(String userId) {
		// TODO Auto-generated method stub

	}
//	private String id;
//	private String name;
//	private int age;
//	private String date_of_birth;
//	private String user_name;
//	private String password;
//	private String user_type_id;
//	private Boolean is_active;
//	private Date created_on;
//	private Date updated_on;

	private User dtoToUser(UserDto userDto) {

		User user = new User();
		user.setId(userDto.getId());
		user.setName(userDto.getName());
		user.setAge(userDto.getAge());
		user.setDate_of_birth(userDto.getDate_of_birth());
		user.setUser_name(userDto.getUser_name());
		user.setPassword(userDto.getPassword());
		user.setUser_types(userDto.getUser_types());
		user.set_active(userDto.getIs_active());
		user.setCreated_on(userDto.getCreated_on());
		user.setUpdated_on(userDto.getUpdated_on());
		return user;
	}

	public UserDto userToUserDto(User user) {
		UserDto userDto = new UserDto();
		userDto.setId(user.getId());
		userDto.setName(user.getName());
		userDto.setAge(user.getAge());
		userDto.setDate_of_birth(user.getDate_of_birth());
		userDto.setUser_name(user.getUser_name());
		userDto.setPassword(user.getPassword());
		userDto.setUser_types(user.getUser_types());
		userDto.setIs_active(user.is_active());
		userDto.setCreated_on(user.getCreated_on());
		userDto.setUpdated_on(user.getUpdated_on());
		return userDto;
	}

}
