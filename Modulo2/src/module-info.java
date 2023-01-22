module database {
    exports com.daniel.database;
    provides com.daniel.database.UserDatabase with com.daniel.database.core.UserDatabaseImpl;
}