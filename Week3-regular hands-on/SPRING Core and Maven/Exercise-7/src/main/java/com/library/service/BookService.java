package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;
    private String librarianName;
    public BookService(String librarianName) {
        this.librarianName = librarianName;
    }
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String bookName) {
        System.out.println(" Librarian: " + librarianName);
        System.out.println("Adding book: " + bookName);
        bookRepository.saveBook(bookName);
    }
}

