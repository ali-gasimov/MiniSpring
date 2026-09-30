package com.alim.mini_spring;

@Component
public class UserRepository {

	 static {
	        System.out.println("UserRepository initialized");
	    }

	    public UserRepository() {
	        System.out.println("UserRepository constructor");
	    }
}
