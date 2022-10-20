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

@Getter
@Setter
@Document(collation = "Department")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Department {

	@Id
	private String id;
@Field(name = "dept_name")
//	@Indexed(unique = true)
	private String deptName;

	@CreatedDate
	@Field(name = "created_on")

	private Date createdOn;

	@LastModifiedDate
	@Field(name = "updated_on")
	private Date updatedOn;

}
