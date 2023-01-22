package com.daniel.service.core;

import com.daniel.database.UserDatabase;
import com.daniel.service.UserService;

import java.util.ServiceLoader;

public class UserServiceImpl implements UserService {

    private UserDatabase userDatabase;

    public UserServiceImpl() {
        ServiceLoader<UserDatabase> userDatabases = ServiceLoader.load(UserDatabase.class);
        userDatabase = userDatabases.iterator().next();
    }

    public String getUser() {
        return userDatabase.getUser();
    }
}
