package ru.mcs.blogging.database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateDatabase {

    public static void createNewDatabase(String fileName) {
        String url = "jdbc:sqlite:./db/" + fileName;

        try (Connection conn = DriverManager.getConnection(url)){
            if(conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println(meta.getDriverName());
                System.out.println("A new database has been created");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());;
        }
    }

    public static void main(String[] args) {
        createNewDatabase("blog.db");
    }
}
