package com.example.demo.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.response.AddUserResponse;
import com.example.demo.service.UserService;
import com.example.demo.validation.Validation;

@RestController
public class SampleController {

	@Autowired
	private UserService userService;

	@Autowired
	private Validation validation;

	@PostMapping(value = "/add")
	public AddUserResponse addUser(@RequestBody User user) {
		Set<String> errorMessages = validation.validateAddUser(user);
		if (!CollectionUtils.isEmpty(errorMessages)) {
			return new AddUserResponse(HttpStatus.PRECONDITION_FAILED, "001", errorMessages);
		} else {
			System.out.println("inside add user");
			return userService.addUser(user);
		}
	}

	@GetMapping("/user/{id}")
	public User getUser(@PathVariable("id") int id) {
		return userService.getUser(id);
	}

	@DeleteMapping("/deleteuser/{id}")
	public User deleteUser(@PathVariable("id") int id) {
		return userService.deleteUser(id);
	}
	/*
	 * @GetMapping("/") public String print() { return ("<h2>Hello</h2>"); }
	 * 
	 * @GetMapping("/user") public String user() { return
	 * ("<h2>hi this is user page</h2>"); }
	 * 
	 * @GetMapping("/admin") public String admin() { return
	 * ("<h2>hi this is admin page</h2>"); }
	 * 
	 * @GetMapping("/post") public String post() { return "postman"; }
	 */
}
