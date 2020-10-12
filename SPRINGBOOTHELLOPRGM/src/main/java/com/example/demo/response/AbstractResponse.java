package com.example.demo.response;

import java.util.List;
import java.util.Set;

import org.springframework.http.HttpStatus;



public class AbstractResponse {

	
	public HttpStatus status;
	public String code;
	public String errorMessage;
	public Set<String> errorMessages;
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public Set<String> getErrorMessages() {
		return errorMessages;
	}
	public void setErrorMessages(Set<String> errorMessages) {
		this.errorMessages = errorMessages;
	}
	

}
