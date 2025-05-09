import java.util.HashMap;
public class LibrarySystem {
    private HashMap<String, Boolean> books;

    public LibrarySystem() {
        books = new HashMap<>();
        // Prepopulate the library with books
        books.put("The Great Gatsby", true);
        books.put("1984", false);
        books.put("To Kill a Mockingbird", true);
    }

    // Method to check book availability
    public String checkBookAvailability(String title) {
        // TODO 1:  Use Amazon Q Developer to suggest code to check
        //  if the book exists in the books HashMap and return
        //  a message indicating the book's availability status.
        if (books.containsKey(title)) {
            boolean isAvailable = books.get(title);
            return "The book '" + title + "' is " + (isAvailable ? "available." : "not available.");
        }

        return null;
    }

    // Method to update a book title in the library
    // TODO 3: Debug and optimize the updateBookTitle method.

    public void updateBookTitle(String oldTitle, String newTitle) {
        // Combine empty title checks
        if (oldTitle == null || oldTitle.isEmpty() || newTitle == null || newTitle.isEmpty()) {
            System.out.println("Book titles cannot be empty!");
            return;
        }

        // Check if old title exists
        if (!books.containsKey(oldTitle)) {
            System.out.println("The book with the given old title does not exist.");
            return;
        }

        // Check if new title already exists
        if (books.containsKey(newTitle)) {
            System.out.println("The new book title already exists in the library.");
            return;
        }

        // Get the availability status of the old title
        Boolean availabilityStatus = books.get(oldTitle);

        // Remove the old title and add the new title with the same availability status
        books.remove(oldTitle);
        books.put(newTitle, availabilityStatus);

        System.out.println("Book title updated successfully!");
    }


}