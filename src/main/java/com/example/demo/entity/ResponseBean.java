package com.example.demo.entity;

import org.springframework.http.HttpStatus;

public class ResponseBean {

	private HttpStatus status;
	private String message;
	private Object data;
	private Object returnCode;
	
	
	public ResponseBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseBean(HttpStatus status, String message, Object data, Object returnCode) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
		this.returnCode = returnCode;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Object getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(Object returnCode) {
		this.returnCode = returnCode;
	}
	@Override
	public String toString() {
		return "ResponseBean [status=" + status + ", message=" + message + ", data=" + data + ", returnCode="
				+ returnCode + "]";
	}
	
	
	
	
	
	

}
