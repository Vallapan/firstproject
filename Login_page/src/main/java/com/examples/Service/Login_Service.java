package com.examples.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.Repository.Login_Repository;
import com.examples.bean.Login_page;

@Service
public class Login_Service {
	
	@Autowired
	private Login_Repository repository;
	

	public Login_page login(String email,String password) {
	 Login_page user=repository.findByEmailAndPassword(email, password);
	  	return user;
	}
}
