package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;
import com.example.demo.response.AddUserResponse;


public interface UserService {
	
	public AddUserResponse addUser(User user);
	
	public User getUser(int id);
	public User deleteUser(int id);
	


}
