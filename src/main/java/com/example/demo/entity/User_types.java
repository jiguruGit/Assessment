package com.example.demo.entity;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "User_types")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User_types {

	@Id
	private String id;
	
	private String user_type_name;
	
	@CreatedDate
	private Date created_on;
	
	@LastModifiedDate
	private Date updated_on;
	
	@Builder.Default 
	private boolean is_active = false ;

		
}
