package com.daniel.app;

import com.daniel.service.UserService;

import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {
	    ServiceLoader<UserService> userServices = ServiceLoader.load(UserService.class);
        UserService userService = userServices.iterator().next();
        System.out.println(userService.getUser());
    }
}
