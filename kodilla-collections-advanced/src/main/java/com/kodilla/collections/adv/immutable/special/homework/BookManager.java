package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    static List<Book> bookList = new ArrayList<>();


    public static Book createBook(String title, String author) {

        Book bookEntry = new Book(title, author);
        //return bookEntry;

        for (Book book : bookList) {
            if (book.getAuthor() == bookEntry.getTitle() & book.getTitle() == bookEntry.getTitle())
                System.out.println("Book "+title+" "+author+" already exists");
        }
        bookList.add(bookEntry);
        return bookEntry;
    }
}