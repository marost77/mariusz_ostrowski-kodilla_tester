package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {


    public static void main(String[] args) {
       //BookManager bookManager = new BookManager();

        Book a = BookManager.createBook("Harry Potter" , "J.K. Rowling");
        Book b= BookManager.createBook("Grube wióry", "Rafał Pacześ");
        Book c = BookManager.createBook("Halny" , "Remigiusz Mróz");
        Book d = BookManager.createBook("aa","bb");
        Book e = BookManager.createBook("aa","bb");

        System.out.println(BookManager.bookList.size());


        System.out.println(BookManager.bookList.get(0).hashCode());
        System.out.println(BookManager.bookList.get(1).hashCode());
        System.out.println(BookManager.bookList.get(2).hashCode());
        System.out.println(BookManager.bookList.get(3).hashCode());
        System.out.println(BookManager.bookList.get(4).hashCode());


        System.out.println(d.equals(e));


        //System.out.println(a == b);
        //System.out.println(a.equals(b));

        //System.out.println(d == e);
        //System.out.println(d.equals(e));
    }
}
