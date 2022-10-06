package com.example.demo.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoRecordFoundException extends RuntimeException{
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = -4946469044807042078L;

	  private String msg;
	  
	  public NoRecordFoundException(String msg) {
		  super();
		  this.msg=msg;
	  }
}
