package ASimulatorSystem;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    public Conn() {
        try {
            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create connection
            c = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bankmanagementsystem",
                "root",
                "Pathmaker@@7019"
            );

            // Create statement
            s = c.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
