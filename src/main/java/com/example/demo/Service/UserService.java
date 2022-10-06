package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ResponseBean;
import com.example.demo.entity.User;
import com.example.demo.exceptions.NoRecordFoundException;
import com.example.demo.repositories.UserRepository;
import com.example.demo.repositories.UserTypeRepositorie;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserTypeRepositorie userTypeRepositorie;

	public User saveUser(User user) {

		ResponseBean response = new ResponseBean();

		if (user.getAge() >= 18) {
			if(user.getUser_types() != null) {
				userTypeRepositorie.save(user.getUser_types());
			}
			/*
			 * User userdetails = userRepository.save(user); response.setData(userdetails);
			 * if (user.getUser_types() != null) { User_types userTypes =
			 * user.getUser_types(); userTypeRepositorie.save(userTypes); }
			 */
		} else {
			response.setMessage("Age must be above 18");
		}
		 User userdetails = userRepository.save(user);
		return userdetails;
	}

	public List<User> allUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	public User findUserById(String name) {
		Optional<User> user = userRepository.findById(name);
		if (user.isPresent()) {
			return user.get(); 
		} else {
			throw new NoRecordFoundException("Not Found");
		}
	}
}
