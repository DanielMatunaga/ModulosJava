package com.daniel.database;

import com.daniel.database.core.UserDatabaseImpl;

public interface UserDatabase {

    String getUser();

    class UserDatabaseFactory {
        public static UserDatabase getUserDatabase() {
            return new UserDatabaseImpl();
        }
    }
}
