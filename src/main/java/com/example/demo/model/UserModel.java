package com.example.demo.model;

import java.util.Date;

import com.example.demo.entity.UserTypes;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserModel {
	
	private String id;
	private String name;
	private int age;
	private String dateOfBirth;
	private String userName;
	private String password;
	private UserTypes userTypes;
	private boolean isActive ;
	private Date createdOn;
	private Date updatedOn;
}
