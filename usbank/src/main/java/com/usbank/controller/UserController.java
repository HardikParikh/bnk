package com.usbank.controller;


import java.util.HashMap;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usbank.bean.User;
import com.usbank.service.UserServiceImpl;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserServiceImpl userService;
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public HashMap<String, User> getAll(){
		return userService.getAllUsers();
    }
}
