package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.demo.entity.Users;
import com.example.demo.model.UserModel;
import com.example.demo.util.ResponseBean;

@RestController
@RequestMapping("/api")
public class UserController {

	@PostMapping(value = "/v1/saveorupdate")
	public ResponseBean save(@RequestBody UserModel userModel, BindingResult result) {
		ResponseBean responseBean = new ResponseBean();
		Users users = new Users();
		try {
			if(result.hasErrors()) {
				org.slf4j.Logger
				log.error("Invalid Payload");
				return ResponseBean.builder().data(null).message("Invalid Payload").status(HttpStatus.BAD_REQUEST)
						.returnCode(0).build();
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return responseBean;

	}

}
