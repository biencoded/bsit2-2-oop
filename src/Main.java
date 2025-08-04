public class Main {
    String title;
    String author;
    int pages;
    boolean isAvailable;

    public Main(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isAvailable = true;
        System.out.println("A new book '" + title + "' by " + author + " has been added to the library!");
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed the book '" + title + "'.");
        } else {
            System.out.println("Sorry, '" + title + "' is currently unavailable.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("You have returned the book '" + title + "'.");
    }

    public static void main(String[] args) {
        Main book1 = new Main("The Hunger Games", "Suzanne Collins", 328);
        Main book2 = new Main("Deadpool Kills the Marvel Universe", "Cullen Bunn", 96);
        Main book3 = new Main("Doctor Strange, Sorcerer Supreme Omnibus Vol. 1", "Roy Thomas", 1064);

        System.out.println("\nBook 1 Info:");
        book1.displayInfo();
        System.out.println("\nBook 2 Info:");
        book2.displayInfo();
        System.out.println("\nBook 3 Info:");
        book3.displayInfo();

        System.out.println("\nAttempting to borrow books:");
        book1.borrowBook();
        book2.borrowBook();
        book1.borrowBook();

        System.out.println("\nReturning books:");
        book1.returnBook();
        book2.returnBook();
    }
}