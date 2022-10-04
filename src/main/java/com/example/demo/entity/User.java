package com.example.demo.entity;

import java.util.Date;
import java.util.Set;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collation = "User")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
	@Id
	private String id;

	@NotBlank
	@Size(max = 20)
	private String name;

	private int age;

	private String date_of_birth;
	
	private String user_name;
	@NotBlank
	@Size(max = 120)
	private String password;

	@DBRef
	private Set<User_types> user_types;

	@Builder.Default
	private boolean is_active = false;

	@CreatedDate
	private Date created_on;

	@LastModifiedDate
	private Date updated_on;

}
