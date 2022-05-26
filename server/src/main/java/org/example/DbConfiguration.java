package org.example;

public class DbConfiguration {
    public static final String HOST_NAME = "localhost";
    public static final String DB_NAME = "FP_DB";
    public static final String DB_PORT = "3306";
    public static final String USER_NAME = "giangnt7";
    public static final String PASSWORD = "YamMiM@12";
    public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final int DB_MIN_CONNECTIONS = 2;
    public static final int DB_MAX_CONNECTIONS = 4;
    // jdbc:mysql://hostname:port/dbname
    public static final String CONNECTION_URL = "jdbc:mysql://" + HOST_NAME + ":" + DB_PORT + "/" + DB_NAME;

    private DbConfiguration() {
        super();
    }
}
