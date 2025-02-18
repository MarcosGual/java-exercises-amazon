import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RollbackTransaction {
    public static void main(String[] args) {
        // Get a database connection
        Connection conn = getDatabaseConnection();
        if (conn != null) {
            System.out.println("Connected to the database successfully!");
            try {
                // Disable auto-commit mode
                conn.setAutoCommit(false);
                System.out.println("Auto-commit disabled. Transactions will be managed manually.");

                // Update Product 2 (Laptops) to add 20 more units
                String updateProduct2SQL = "UPDATE products SET quantity = quantity + 20 WHERE product_id = ?";
                PreparedStatement updateProduct2Stmt = conn.prepareStatement(updateProduct2SQL);
                updateProduct2Stmt.setInt(1, 2);  // Product ID 2 (Laptops)
                updateProduct2Stmt.executeUpdate();
                System.out.println("Product 2: Laptops quantity updated by adding 20.");

                // Simulate an error by updating a non-existent product (Product ID 4)
                String updateProduct4SQL = "UPDATE products SET quantity = quantity + 20 WHERE product_id = ?";
                PreparedStatement updateProduct4Stmt = conn.prepareStatement(updateProduct4SQL);
                updateProduct4Stmt.setInt(1, 4);  // Product ID 4 doesn't exist
                int rowsAffected = updateProduct4Stmt.executeUpdate();  // This will throw an error
                if (rowsAffected == 0) {
                    // Manually throw an SQLException if no rows were affected
                    throw new SQLException("Update failed: No product found with product_id = 4");
                } else {
                    System.out.println("Product ID 4 quantity updated by adding 20.");
                }

                // Commit the transaction
                conn.commit();
                System.out.println("Transaction committed successfully.");
            } catch (SQLException e) {
                try {
                    // Roll back the transaction if an error occurs
                    conn.rollback();
                    System.out.println("Transaction rolled back due to error: " + e.getMessage());
                } catch (SQLException rollbackEx) {
                    System.out.println("Rollback failed: " + rollbackEx.getMessage());
                }
            } finally {
                try {
                    // Close the connection
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("SQL exception: " + ex.getMessage());
                }
            }
        } else {
            System.out.println("Failed to connect to the database.");
        }
    }

    private static Connection getDatabaseConnection() {
        String url = "jdbc:mysql://localhost:3306/warehouse";
        String user = "root";
        String password = "1959marcos";
        try {
            // Step 1: Connect to database
            System.out.println("Auto-commit disabled. Transactions will be managed manually.");
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
            return null;
        }
    }

    private static void removeExpiredProduct(Connection conn, int productId) throws SQLException {
        try {
            // Step 1: Write SQL query to delete a product by its ID
            String deleteProductSQL = "DELETE FROM products WHERE product_id = ?";

            // Step 2: Create a PreparedStatement for the delete operation
            PreparedStatement deleteStmt = conn.prepareStatement(deleteProductSQL);

            // Step 3: Set the productId parameter in the PreparedStatement
            deleteStmt.setInt(1, productId);

            // Step 4: Execute the update and check the number of affected rows
            int rowsAffected = deleteStmt.executeUpdate();

            // Step 5: If no rows were affected, throw an SQLException indicating the product was not found
            if (rowsAffected == 0) {
                throw new SQLException("No product found with product_id = " + productId);
            }

            // Success message for product removal
            System.out.println("Product with product_id = " + productId + " removed successfully.");
        } catch (SQLException e) {
            // Exception handling: If an error occurs, print the message and rethrow the exception
            System.out.println("Error removing product with product_id = " + productId + ": " + e.getMessage());
            throw e;  // Rethrow the exception to be handled at a higher level (e.g., main method)
        }
    }
}