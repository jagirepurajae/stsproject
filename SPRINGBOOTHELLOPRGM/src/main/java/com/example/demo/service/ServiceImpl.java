package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.response.AbstractResponse;
import com.example.demo.response.AddUserResponse;

@Service
public class ServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public AddUserResponse addUser(User user) {

		AddUserResponse addUserResponse = new AddUserResponse();

		userRepository.save(user);
		addUserResponse.setUser(user);
		addUserResponse.setStatus(HttpStatus.OK);
		addUserResponse.setCode("success");
		return addUserResponse;

	}

	@Override
	public User getUser(int id) {

		Optional<User> opt = userRepository.findById(id);
		User u = opt.get();
		return u;

	}

	@Override
	public User deleteUser(int id) {
		AbstractResponse res = new AbstractResponse();

		Optional<User> op = userRepository.findById(id);
		User u = op.get();
		userRepository.deleteById(id);
		return u;

	}

}
