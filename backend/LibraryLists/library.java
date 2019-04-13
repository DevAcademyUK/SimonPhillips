package backend.LibraryLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class library {
    Scanner myScanner = new Scanner(System.in);

    List<book> books = new ArrayList<book>();
    List<member> members = new ArrayList<member>();
    List<loan> loans = new ArrayList<loan>();

    public static void main(String[] args) {
        library lib = new library();
        lib.init();
    }

    public void init() {
        books.add(new book(1, "In Search of Lost Time", "Marcel Proust", "1913"));
        books.add(new book(2, "Ulysses", "James Joyce", "1922"));
        books.add(new book(3, "Moby Dick", "Herman Melville", "1851"));
        books.add(new book(4, "Pride and Prejudice", "Jane Austen", "1813"));
        books.add(new book(5, "The Canterbury Tales", "Geoffrey Chaucer", "1387"));

        members.add(new member(1, "Simon", "Phillips", (byte) 30));
        members.add(new member(2, "David", "Southwell", (byte) 55));
        members.add(new member(3, "Kevin", "Phillips", (byte) 39));
        members.add(new member(4, "Kirsty", "Southwell", (byte) 37));
        members.add(new member(5, "Peter", "Alsop", (byte) 25));

        loans.add(new loan(2, 4));
        loans.add(new loan(5, 2));

        menu();
    }

    private void menu() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Welcome to Bristol library");
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
                System.out.println("Invalid input provided, please try again \n");
                menu();
        }
    }

    private void searchBook() {
        for (book a : books) {
            System.out.println(a.bookTitle);
        }

        System.out.println("\n");
        Collections.sort(books);

        for (book b : books) {
            System.out.println(b.bookTitle);
        }

        System.out.println("\n");
        menu();
    }

    private void checkBook() {

    }

    private void searchAuthor() {
        Collections.sort(books, book.bookAuthorComparator);

        for (book b : books) {
            System.out.println(b.bookAuthor);
        }
        System.out.println("\n");
        menu();
    }
}