//18. Write a program to generate SQLException 
public class SqlException {

    public static void main(String[] args) {
        String sql = "SELECT * FROM nonexistent_table"; // This SQL query will fail

        try {
            // Simulating a SQLException
            throw new java.sql.SQLException("Table does not exist: " + sql);
        } catch (java.sql.SQLException e) {
            System.out.println("SQLException caught: " + e.getMessage());
        }
    }
}