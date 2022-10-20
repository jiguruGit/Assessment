package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.demo.entity.User;
import com.example.demo.repositories.UserRepository;
import com.example.demo.util.ResponseBean;

public class EmployeeRegisterationService {

	@Autowired
	private UserRepository userRepository;

	public ResponseEntity<ResponseBean> getById(String name) {
		ResponseBean responseBean = new ResponseBean();
		Optional<User> userRecords = userRepository.findByName(name);
		responseBean.setStatus(HttpStatus.OK);
		if(userRecords.isPresent()) {
			responseBean.setMessage("records are ");
			responseBean.setData(userRecords.get());
		}else {
			responseBean.setMessage("No record found");
			responseBean.setData(null);
		}catch (Exception e) {

			log.error
		}
		return new ResponseEntity<>(responseBean, HttpStatus.OK);
		
		
	}

}
