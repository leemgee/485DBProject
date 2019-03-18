package DBMain;


import java.sql.*;

public class DBCommands extends DBGUI {
    private void view() {
        // Build a SQL SELECT statement
        String query = "SELECT * FROM Staff WHERE ID = "
                + "'" + ID.getText().trim() + "'";
        try {
            // Execute query

            ResultSet rs = stmt.executeQuery(query);

            // Test if record found and populate screen
            if (rs.next()) {
                lastname.setText(rs.getString(2));
                firstname.setText(rs.getString(2));
                address.setText(rs.getString(4));
                ID.setText(rs.getString(5));
                email.setText(rs.getString(6));
            } else {
                clear();
                lblStatus.setText("Record not found");

            }
        } catch (SQLException ex) {
            lblStatus.setText("Select failed" + ex);
        }
    }

    private void insert() {
        // Build a SQL INSERT statement
        String insertStmt =
                "INSERT INTO STAFF(ID, LastName, FistName,City, " + "State, Telephone) VALUES('" +
                        ID.getText().trim() + "','" +
                        lastname.getText().trim() + "','" +
                        firstname.getText().trim() + "','" +
                        address.getText().trim() + "','" +
                        email.getText().trim() + "','";

        try {
            stmt.executeQuery(insertStmt);
            lblStatus.setText("Record inserted");

        } catch (SQLException ex) {
            lblStatus.setText("insert failed" + ex);
        }


    }

    private void update() {
        // Build a SQL UPDATE statement
        String updateStmt = "UPDATE Staff " +
                "SET LastName = '" + lastname.getText().trim() + "'," +
                "FirstName = '" + firstname.getText().trim() + "'," +
                "City = '" + address.getText().trim() + "'," +
                "State = '" + email.getText().trim() + "'," +
                "Telephone = '" + ID.getText().trim() + "' ";

        try {
            stmt.executeUpdate(updateStmt);
            lblStatus.setText("Record updated");
        } catch (SQLException ex) {
            lblStatus.setText("Update failed: " + ex);
        }
    }

    private void clear() {
        lastname.clear();
        firstname.clear();
        address.clear();
        email.clear();
        ID.clear();
    }


}
