package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book a = BookManager.createBook("Harry Potter" , "J.K. Rowling");
        Book b= BookManager.createBook("Grube wióry", "Rafał Pacześ");
        Book c = BookManager.createBook("Halny" , "Remigiusz Mróz");
        Book d =BookManager.createBook("aa","bb");
        Book e =BookManager.createBook("aa","bb");

        System.out.println(a == b);
        System.out.println(a.equals(b));

        System.out.println(d == e);
        System.out.println(d.equals(e));
    }
}
