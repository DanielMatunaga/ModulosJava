package com.daniel.service.core;

import com.daniel.database.UserDatabase;
import com.daniel.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDatabase userDatabase;

    public UserServiceImpl() {
        userDatabase = UserDatabase.UserDatabaseFactory.getUserDatabase();
    }

    public String getUser() {
        return userDatabase.getUser();
    }
}
