package com.oop;

public class Main {
    public static void main(String[] args) {
        Book book=new Book();
        book.addBook("mm", "mm", "9876", "oiuy");
        System.out.println(book.authorName);
        book.removeBook("mm", "mm", "9876", "oiuy");
        System.out.println(book.authorName);
    }
}
