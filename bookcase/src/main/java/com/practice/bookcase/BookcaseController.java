package com.practice.bookcase;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class BookcaseController {


    Book book = new Book();

    @GetMapping("/viewBooks")
    public String viewBooks(Model model) {
        book.getAllBooks();
        model.addAttribute("book", Book.books);
        return "viewBooks";
    }

    @GetMapping("/addBook")
    public String addBook(Model model) {
        int nextID = Book.books.size() + 1;
        System.out.println(nextID);
        Book book = new Book();
        book.setBookID(nextID);
        model.addAttribute("book", book);
        return "addBook";
    }

    @PostMapping("/bookAdded")
    public String bookAdded(@ModelAttribute Book book) {
        Book.addNewBook(book);
        return "index";
    }

    @GetMapping("/editDeleteBook")
    public String editDeleteBook(Model model) {
        model.addAttribute("book", Book.books);
        model.addAttribute("aBook", new Book());
        return "editDeleteBook";
    }

    @PostMapping("/bookEdit")
    public String bookToEdit(@ModelAttribute Book book, Model model) {
        Book b = new Book();
        for(Book bk : Book.books) {
            if(bk.getBookID() == book.getBookID()) {
                b = bk;
            }
        }
        model.addAttribute("book", b);
        return "bookEdit";
    }

    @PostMapping("/bookSaved")
    public String bookSaved(@ModelAttribute Book book) {
        for(Book b : Book.books){
            if(b.getBookID() == book.getBookID()) {
                int index = Book.books.indexOf(b);
                Book.books.set(index, book);
                break;
            }
        }
        return "/index";
    }

    @PostMapping("bookDelete")
    public String bookDelete(@ModelAttribute Book book, Model model) {
        Book b = new Book();
        for(Book bk : Book.books){
            if(bk.getBookID() == book.getBookID()){
                b = bk;
            }
        }
        model.addAttribute("book", b);
        return "bookDelete";
    }

    @PostMapping("/bookDeleted")
    public String bookDeleted(@ModelAttribute Book book) {
        for(Book b : Book.books){
            if(b.getBookID() == book.getBookID())  {
                int index = Book.books.indexOf(b);
                Book.books.remove(index);
                break;
            }
        }
        return "/index";
    }
}
