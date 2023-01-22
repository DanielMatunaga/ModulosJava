package com.daniel.service;

import com.daniel.service.core.UserServiceImpl;

public interface UserService {

    String getUser();

    class UserServiceFactory {
        public static UserService getUserService() {
            return new UserServiceImpl();
        }
    }

}
