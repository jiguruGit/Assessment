package com.example.demo.payloids;

import java.util.Date;
import java.util.Set;

import com.example.demo.entity.User_types;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class UserDto {

	private String id;
	private String name;
	private int age;
	private String date_of_birth;
	private String user_name;
	private String password;
	private Set<User_types> user_types;
	private Boolean is_active;
	private Date created_on;
	private Date updated_on;
}
