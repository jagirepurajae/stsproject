package com.rs.fer.util;

import com.rs.fer.model.User;
import com.rs.fer.request.RegistrationVO;
import com.rs.fer.request.UserVO;

public class FERUtil {

	public static User loadRegistrationVOToUser(RegistrationVO registrationVO) {
		User user = new User();

		user.setFirstName(registrationVO.getFirstName());
		user.setMiddleName(registrationVO.getMiddleName());
		user.setLastName(registrationVO.getLastName());

		user.setEmail(registrationVO.getEmail());
		user.setMobile(registrationVO.getMobile());

		user.setUserName(registrationVO.getUserName());
		user.setPassword(registrationVO.getPassword());

		user.setCreated(DateUtil.getCurrentDate("dd-M-yyyy hh:mm:ss"));

		return user;

	}
	
	public static User loadUpdateUserVOToUser(UserVO userVO, User userdb) {
		System.out.println("inside load ()");
		userdb.setFirstName(userVO.getNameInfo().getFirstName());
		userdb.setMiddleName(userVO.getNameInfo().getMiddleName());
		userdb.setLastName(userVO.getNameInfo().getLastName());
		userdb.setEmail(userVO.getContactInfo().getEmail());
		userdb.setMobile(userVO.getContactInfo().getMobile());
		
		if(!userVO.getAddressVO().getLineOne().isEmpty())
		{
			userdb.getAddress().setLineOne(userVO.getAddressVO().getLineOne());
			userdb.getAddress().setLineTwo(userVO.getAddressVO().getLineTwo());
			userdb.getAddress().setCity(userVO.getAddressVO().getCity());
			userdb.getAddress().setState(userVO.getAddressVO().getState());
			userdb.getAddress().setPostal(userVO.getAddressVO().getPostal());
			userdb.getAddress().setCountry(userVO.getAddressVO().getCountry());
		userdb.setUpdated(DateUtil.getCurrentDate("dd-M-yyyy hh:mm:ss"));	
		}
		userdb.setUpdated(DateUtil.getCurrentDate("dd-M-yyyy hh:mm:ss"));
		return userdb;

	}
	
}
