package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class demo {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection(
               url,username,password
            );

            System.out.println("Connected successfully!");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
