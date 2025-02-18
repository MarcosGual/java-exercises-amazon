import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InventoryManagement {
    public static void main(String[] args) {
        // Get a database connection
        Connection conn = getDatabaseConnection();
        if (conn != null) {
            System.out.println("Connected to the database successfully!");
            try {
                // Step 2: Create the products table if it doesn't exist
                String createTableSQL = "CREATE TABLE IF NOT EXISTS products ("
                        + "product_id INT PRIMARY KEY, "
                        + "quantity INT)";
                Statement stmt = conn.createStatement();
                stmt.execute(createTableSQL);

                System.out.println("Table 'products' created or already exists.");

                // Step 3: Disable auto-commit mode
                conn.setAutoCommit(false);
                System.out.println("Auto-commit disabled. Transactions will be managed manually.");

                // Step 4: Prepared statement
                String insertProductSQL = "INSERT INTO products (product_id, quantity) VALUES (?, ?)";
                PreparedStatement insertStmt = conn.prepareStatement(insertProductSQL);

                // Insert Product 1 (Smartphones) with a quantity of 50
                insertStmt.setInt(1, 1);  // Product ID 1
                insertStmt.setInt(2, 50); // Quantity
                insertStmt.executeUpdate();
                System.out.println("Product 1: Smartphones inserted with quantity 50.");

                // Insert Product 2 (Laptops) with a quantity of 100
                insertStmt.setInt(1, 2);  // Product ID 2
                insertStmt.setInt(2, 100); // Quantity
                insertStmt.executeUpdate();
                System.out.println("Product 2: Laptops inserted with quantity 100.");

                // Step 5: Update Product 2 (Laptops) to add 20 more units
                String updateProduct2SQL = "UPDATE products SET quantity = quantity + 20 WHERE product_id = ?";
                PreparedStatement updateProduct2Stmt = conn.prepareStatement(updateProduct2SQL);
                updateProduct2Stmt.setInt(1, 2);  // Product ID 2 (Laptops)
                updateProduct2Stmt.executeUpdate();
                System.out.println("Product 2: Laptops quantity updated by adding 20.");

                // Step 6: Commit the transaction
                conn.commit();
                System.out.println("Transaction committed successfully.");

            }catch (SQLException e) {
                System.out.println("SQL exception " + e.getMessage());
            }catch (Exception e) {
                System.out.println("Failed to connect to the database.");
            }finally {
                try {
                    // Close the connection
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("SQL exception " + ex.getMessage());
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
}
