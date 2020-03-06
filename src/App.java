import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        // 1. Read the configuration file for the DB

        // 2. establish a connection to a database
        Connection conn = null;
        Config cfg = new Config();
        String mDbUrl = cfg.getProperty("mDbUrl"); // In FIle -> Project Structure add the resource folder .
        System.out.println(mDbUrl);
        // String url = "jdbc:sqlite:data.db";
        String url = mDbUrl;
        // mDbUrl = jdbc:sqlite:data.db
        try {
            // db parameters
            // String url = "jdbc:sqlite:data.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

        /*
        // 3. create a Form
        JFrame userFrame = new Users("Users Manager"); // Alt + Enter add the required imports
        // frame.setContentPane(new CelsiusConvertorGUI().mainPanel);
        userFrame.setVisible(true);
        */

        // JFrame userFrame = new DisplayUsersData("Fetching Users Info From DataBase", url);
        JFrame mainAppForm = new MainAppForm("Galin Petrishki App", url);
        mainAppForm.setVisible(true);

    }
}
