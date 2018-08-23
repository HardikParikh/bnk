package com.usbank.service;

import java.util.HashMap;

import com.usbank.bean.User;
import com.usbank.exception.UserNotFound;

public class UserServiceImpl implements UserService{
	
	@Override
	public HashMap<String, User> getAllUsers() {

		HashMap<String, User> hm = new HashMap<>();	
		try{	
			hm.put("1", new User(1,"Hardik","Parikh","h.y.parikh@gmail.com"));			
		}catch(UserNotFound e)
		{
			throw new UserNotFound("User not found");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return hm;
	}
}
