module service {
    exports com.daniel.service;
    provides com.daniel.service.UserService with com.daniel.service.core.UserServiceImpl;

    requires database;
    uses com.daniel.database.UserDatabase;
}