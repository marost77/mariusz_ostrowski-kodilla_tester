package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {


    public static Book createBook(String title, String author) {

        List<Book> bookList = new ArrayList<>();
        Book bookEntry = new Book(title, author);

        for (Book book : bookList) {
            if (book.getAuthor() != bookEntry.getAuthor() & book.getTitle() != bookEntry.getTitle())
                bookList.add(bookEntry);
            return new Book(bookEntry.getTitle(), bookEntry.getAuthor());
        }
        return null;
    }
}