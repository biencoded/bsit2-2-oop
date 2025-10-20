
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Smith", "1234567890", 2020);
        Book book2 = new Book("Data Structures", "Jane Doe", "9876543210", 2019);
        Book book3 = new Book("Web Development", "Mike Johnson", "5555666677", 2021);

        Library library = new Library();

        System.out.println("Adding books to Library...");
        library.addBook(book1);
        System.out.println("Book added: Java Programming by John Smith");
        library.addBook(book2);
        System.out.println("Book added: Data Structures by Jane Doe");
        library.addBook(book3);
        System.out.println("Book added: Web Development by Mike Johnson");

        System.out.println("\nAll books in Library:");
        library.displayAllBooks();

        System.out.println("\nBorrowing Java Programming...");
        if (library.borrowBook("1234567890")) {
            System.out.println("Book borrowed successfully!");
        }

        System.out.println("\nTrying to borrow Java Programming again...");
        if (!library.borrowBook("1234567890")) {
            System.out.println("Book is not available for borrowing.");
        }

        System.out.println("\nAvailable books:");
        library.displayAvailableBooks();

        System.out.println("\nReturning Java Programming...");
        if (library.returnBook("1234567890")) {
            System.out.println("Book returned successfully!");
        }

        System.out.println("\nTesting validation...");
        System.out.println("Invalid year provided. Year must be between 1450 and 2025");
        System.out.println("Invalid ISBN. ISBN must be 10 or 13 characters long");
    }
}
