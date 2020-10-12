package com.example.demo.validation;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.example.demo.entity.User;

import antlr.StringUtils;

@Component
public class ValidationImpl implements Validation{

	@Override
	public Set<String> validateAddUser(User user) {
		Set<String> errorMessages=new HashSet<String>();
		addErrors(errorMessages,user.getId(),"userid cannot be empty");
		addErrors(errorMessages,user.getName(),"user name cannot be empty");
		addErrors(errorMessages,user.getSalary(),"please enter valid salary");
		return errorMessages;
	}
	
	public static Set<String> addErrors(Set<String> errorMessages, int id,String errorMessage)
	{
		if(id<0) 
		{
			errorMessages.add(errorMessage);}
		return errorMessages;
	}

	public static Set<String> addErrors(Set<String> errorMessages, String name,String errorMessage)
	{
		if(org.springframework.util.StringUtils.isEmpty(name)) 
		{
			errorMessages.add(errorMessage);}
		return errorMessages;
	}
	
	public static Set<String> addErrors(Set<String> errorMessages, float salary,String errorMessage)
	{
		if(salary<=0) 
		{
			errorMessages.add(errorMessage);}
		return errorMessages;
	}
}
