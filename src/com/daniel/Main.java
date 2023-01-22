package com.daniel;

import com.daniel.service.UserService;

public class Main {

    public static void main(String[] args) {
	    UserService userService = UserService.UserServiceFactory.getUserService();
        System.out.println(userService.getUser());
    }
}
