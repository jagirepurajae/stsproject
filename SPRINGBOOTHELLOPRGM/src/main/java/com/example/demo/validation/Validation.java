package com.example.demo.validation;

import java.util.Set;

import com.example.demo.entity.User;

public interface Validation {

	Set<String> validateAddUser(User user);
}
