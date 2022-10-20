package com.example.demo.entity;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "userType")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserTypes {

	@Id
	private String id;

	@Field(name = "user_types")
	private String userTypeName;

	@CreatedDate
	@Field(name = "created_on")
	private Date createdOn;

	@LastModifiedDate
	@Field(name = "updated_on")
	private Date updatedOn;

	@Builder.Default
	@Field(name = "is_active")
	private boolean isActive = false;

}
