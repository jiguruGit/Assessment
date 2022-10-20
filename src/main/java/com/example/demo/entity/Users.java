package com.example.demo.entity;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "users")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Users {
	@Id
	private String id;

	@NotBlank
	@Size(max = 20)
	@Field(name = "name")
	private String name;
	@Field(name = "age")
	private int age;
	@Field(name = "date_of_birth")
	private String dateOfBirth;
	@Field(name = "user_name")
	private String userName;
	@NotBlank
	@Size(max = 120)
	@Field(name = "password")
	private String password;

	@DBRef
	@Field(name = "user_types")
	private UserTypes userTypes;

	@Builder.Default
	@Field(name = "is_active")
	private boolean isActive = false;

	@CreatedDate
	@Field(name = "created_on")
	private Date createdOn;

	@LastModifiedDate
	@Field(name = "updated_on")
	private Date updatedOn;

}
