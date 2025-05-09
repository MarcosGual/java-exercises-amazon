public class Main {

    // TODO 2: Write comments to guide Amazon Q Developer to generate code to test the checkBookAvailability method.

// Create the main method
// Create an instance of the LibrarySystem class
// Add test cases to check whether a book is available, checked out or not present in the library’s collection.
    public static void main(String[] args) {
        LibrarySystem library = new LibrarySystem();

        // Test cases
        System.out.println(library.checkBookAvailability("The Great Gatsby"));
        System.out.println(library.checkBookAvailability("1984"));
        System.out.println(library.checkBookAvailability("To Kill a Mockingbird"));
        System.out.println(library.checkBookAvailability("The Catcher in the Rye"));


//       TODO 4:  generate test cases for the following outputs.
//        Output: "Book title updated successfully!"
//        Output: "The book with the given old title does not exist."
//        Output: "The new book title already exists in the library."
        library.updateBookTitle("The Great Gatsby", "The Greatest Gatsby");
        library.updateBookTitle("Harry Potter", "Harry Potter and the Chamber of Secrets");
        library.updateBookTitle("The Greatest Gatsby", "1984");
    }

}
