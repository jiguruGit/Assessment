package com.example.demo.entity;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collation = "Employee")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@EqualsAndHashCode(callSuper = false)
public class Employee {

	@Id
	private String id;
	@Field(name = "date_of_joining")
	private String dateOfJoining;

	@CreatedDate
	@Field(name = "created_on")
	private Date createdOn;

	@LastModifiedDate
	@Field(name = "updated_on")
	private Date updatedOn;

	@Builder.Default
	@Field(name = "is_active")
	private boolean isActive = false;

	@DBRef
	private User user;

	@DBRef
	private Department department;

}
