package steps;

import net.thucydides.core.annotations.Step;

import java.sql.*;

public class MySteps {

    private static Connection conn;
    private static Statement st;
    private static ResultSet rs;

    @Step
    public void createConnection() {

        try {

            Class.forName("org.h2.Driver");
            conn = DriverManager.
                    getConnection("jdbc:h2:mem:testdb", "sa", "");
            rs = st.executeQuery("Select * from student");

            while (rs.next()) {
                // Retrieve by column name
                int id = rs.getInt("id");

                String first = rs.getString("first");
                String last = rs.getString("last");

                // Display values
                System.out.print("ID: " + id);
                System.out.print(", First: " + first);
                System.out.println(", Last: " + last);
        }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
