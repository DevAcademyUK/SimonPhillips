package backend.Library;
import java.util.Scanner;

public class library {
    Scanner myScanner = new Scanner(System.in);

    book[] books = new book[5];
    member[] members = new member[5];
    loan[] loans = new loan[2];


    public static void main(String[] args) {
        library lib = new library();
        lib.init();

    }

    public void init() {
        books[0] = new book(1, "In Search of Lost Time", "Marcel Proust", "1913");
        books[1] = new book(2, "Ulysses", "James Joyce", "1922");
        books[2] = new book(3, "Moby Dick", "Herman Melville", "1851");
        books[3] = new book(4, "Pride and Prejudice", "Jane Austen", "1813");
        books[4] = new book(5, "The Canterbury Tales", "Geoffrey Chaucer", "1387");

        members[0] = new member(1, "Dean", "Lewis", (byte) 30);
        members[1] = new member(2, "Steve", "Beckwith", (byte) 55);
        members[2] = new member(3, "Lisa", "Crow", (byte) 39);
        members[3] = new member(4, "Vicky", "Cross", (byte) 37);
        members[4] = new member(5, "Rachel", "Alsop", (byte) 25);

        loans[0] = new loan(2, 4);
        loans[1] = new loan(5, 2);

        menu();
    }

    private void menu() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Welcome to Simon's library");
        System.out.println("Select an option from the list below:");
        System.out.println("1 - Search for a book");
        System.out.println("2 - Check if a book is available");
        System.out.println("3 - Search for an Author");
        int choice = Integer.parseInt(myScanner.nextLine());

        switch (choice) {
            case 1:
                searchBook();
                break;

            case 2:
                checkBook();
                break;

            case 3:
                searchAuthor();
                break;

            default:
                System.out.println("Invalid input provided, please try again");
                menu();
        }
    }

    private void searchBook() {
        System.out.println("What is the name of the book you would like to search for?");
        String title = myScanner.nextLine();

        for (int i = 0; i < books.length; i++) {
            if (books[i].bookTitle.equalsIgnoreCase(title)) {
                System.out.println("We have that book in the library");
                System.out.println();
                menu();
            } else if (i == books.length - 1) {
                System.out.println("Sorry, we do not currently stock that book");
                System.out.println();
                menu();
            }
        }
    }

    private void checkBook() {
        System.out.println("What book would you like to check?");
        String book = myScanner.nextLine();

        if (book.equalsIgnoreCase("In Search of Lost Time"){
            System.out.println("We currently have 2 copies of " + books[0]);
        } else if (book.equalsIgnoreCase("Ulysses")) {
            System.out.println("We currently have 4 copies of " + books[1]);
        } else if (book.equalsIgnoreCase( "Moby Dick")) {
            System.out.println("We currently have 1 copies of " + books[2]);
        } else if (book.equalsIgnoreCase("Pride and Prejudice")) {
            System.out.println("We currently have 3 copies of " + books[3]);
        } else if (book.equalsIgnoreCase("The Canterbury Tales")) {
            System.out.println("We currently have 5 copies of " + books[4]);
        } else {
            System.out.println("We don't have your book in stock");
        }
        menu();
    }

    private void searchAuthor() {
        System.out.println("What is the name of the author you'd like to search for?");
        String author = myScanner.nextLine();

        for (book b : books) {
            int count = 0;
            if (b.bookAuthor.equalsIgnoreCase(author)) {
                System.out.println(b.bookTitle);
            } else if (count == books.length - 1) {
                System.out.println("Sorry we dont have any books by that author");
            }
            count++;
        }


        if (author == "Marcel Proust") {
            System.out.println("We have 2 copies of " + books[0] + " would you like to reserve a copy");
        } else if (author == "James Joyce") {
            System.out.println("We have 4 copies of " + books[1] + " would you like to reserve a copy");
        } else if (author == "Herman Melville") {
            System.out.println("We have 1 copies of " + books[2] + " would you like to reserve a copy");
        } else if (author == "Jane Austen") {
            System.out.println("We have 3 copies of " + books[3] + " would you like to reserve a copy");
        } else if (author == "Geoffrey Chaucer") {
            System.out.println("We have 5 copies of " + books[4] + " would you like to reserve a copy");
        } else {
            System.out.println("We do not have any books with the author you want in stock");
        }
        menu();
    }
}