package DBMain;

import javafx.scene.control.Label;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnector {

    private Label lblStatus = new Label();
    private Statement stmt;

    private void initializeDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/?user=root", "root", "root");

            System.out.println("Database connected\n");

            lblStatus.setText("Database connected");

            stmt = conn.createStatement();
        } catch (Exception ex) {
            lblStatus.setText("Connection failed: " + ex);
        }
    }
}
