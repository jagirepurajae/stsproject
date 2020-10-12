package com.example.demo.response;

import java.util.Set;

import org.springframework.http.HttpStatus;

import com.example.demo.entity.User;

public class AddUserResponse extends AbstractResponse {

	public User user;

	public AddUserResponse() {

	}

	public AddUserResponse(HttpStatus status,String code, Set<String> errorMessages) {
		super.setStatus(status);
		super.setCode(code);
		super.setErrorMessages(errorMessages);		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
