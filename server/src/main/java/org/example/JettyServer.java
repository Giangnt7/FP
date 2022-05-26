package org.example;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;
import org.example.PostFormHandler.PostFormHandler;
import org.example.PostHandler.PostJsonHandler;
import org.example.handler.GetHandler;
import org.apache.log4j.Logger;
import java.sql.*;

public class JettyServer {
    // JDBC
    private static String DB_URL = "jdbc:mysql://localhost:3306/FP_DB";
    private static String USER_NAME = "giangnt7";
    private static String PASSWORD = "YamMiM@12";

    public static void execute() {
        try {
            // connection
            String sqlSelect = "Select * from user";
            try (Connection con = C3p0DataSource.getConnection();
                 Statement st = con.createStatement();
                 ResultSet rs = st.executeQuery(sqlSelect);) {
                while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2));
            }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception {
//        try {
//            // connect to database 'FP_DB'
//            Connection conn = getConnection(DB_URL, USER_NAME, PASSWORD);
//            // crate statement
//            Statement stmt = conn.createStatement();
//            // get data from table 'user'
//            ResultSet rs = stmt.executeQuery("select * from user");
//            // show data
//            while (rs.next()) {
//                System.out.println(rs.getInt(1) + "  " + rs.getString(2));
//            }
//            // close connection
//            conn.close();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
        execute();
        Logger logger = Logger.getLogger("123");
        logger.info("Test 123");
        Server server = new Server(8080);

        ServletHandler handler = new ServletHandler();
        handler.addServletWithMapping(GetHandler.class, "/get");
        handler.addServletWithMapping(PostJsonHandler.class, "/post/json");
        handler.addServletWithMapping(PostFormHandler.class, "/post/form");
        server.setHandler(handler);

        server.start();
        server.join();
    }
//    public static Connection getConnection(String dbURL, String userName,
//                                           String password) {
//        Connection conn = null;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            conn = DriverManager.getConnection(dbURL, userName, password);
//            System.out.println("connect successfully!");
//        } catch (Exception ex) {
//            System.out.println("connect failure!");
//            ex.printStackTrace();
//        }
//        return conn;
//    }
}
