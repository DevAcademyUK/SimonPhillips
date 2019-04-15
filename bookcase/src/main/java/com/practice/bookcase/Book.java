package com.practice.bookcase;

import java.util.ArrayList;

public class Book {
    private int bookID;
    private String bookTitle;
    private String bookAuthor;
    private String bookYear;
    private String bookBlurb;
    private String coverUrL;
    InitialiseDB initDB = new InitialiseDB();


    public static ArrayList<Book> books = new ArrayList<>();

    public Book() {

    }

    public Book(int bookID, String bookTitle, String bookAuthor, String bookYear, String bookBlurb, String coverUrL) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
        this.bookBlurb = bookBlurb;
        this.coverUrL = coverUrL;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookYear() {
        return bookYear;
    }

    public void setBookYear(String bookYear) {
        this.bookYear = bookYear;
    }

    public static void addNewBook(Book book) {
        if (books.size() > 0) {
            for (Book b : books) {
                if (!books.contains(book)) {
                    books.add(book);
                    break;
                } else
                    System.out.println("That book is already in your library.");
            }
        } else {
            books.add(book);
        }
    }

    public String getBookBlurb() {
        return bookBlurb;
    }

    public void setBookBlurb(String bookBlurb) {
        this.bookBlurb = bookBlurb;
    }

    public String getCoverURL() {
        return coverUrL;
    }

    public void setCoverUrL(String coverUrL) {
        this.coverUrL = coverUrL;
    }

    public ArrayList<Book> getAllBooks() {
        books = initDB.getBooks(initDB.getDBConnection());
        return books;
    }
}
