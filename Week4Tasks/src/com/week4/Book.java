package com.week4;
import java.util.ArrayList;
public class Book extends Library {
    String bookTitle;
    String authorName;
    String bookID;
    String bookVersion;
    boolean bookAvailabilityStatus;
    ArrayList<String> autherName = new ArrayList<String>();
    ArrayList<String> bookId = new ArrayList<String>();
    ArrayList<String> bookVresion = new ArrayList<String>();
    ArrayList<String> borrowedBooks = new ArrayList<String>();

    public Book(String libraryName, int libraryCode, ArrayList<String> books) {
        super(libraryName, libraryCode);
    }

    public void addBook(String bookTitle,String authorName,
                        String bookID,String bookVersion){
        this.bookTitle=bookTitle;
        this.authorName=authorName;
        this.bookID=bookID;
        this.bookVersion=bookVersion;
        books.add(bookTitle);
        autherName.add(authorName);
        bookId.add(bookID);
        bookVresion.add(bookVersion);
    }
    public void removeBook(String bookTitle,String authorName,
                           String bookID,String bookVersion){
        books.remove(bookTitle);
        autherName.remove(authorName);
        bookId.remove(bookID);
        bookVresion.remove(bookVersion);
    }

    public void checkOut(String bookName){
        borrowedBooks.remove(bookName);
    }
    public void displayAvilableBooks(){
        System.out.println(books);
    }
    public void borrowedBooks(){
        System.out.println(borrowedBooks);
    }
    public String viewBookDetails(String ID){
        return bookTitle;
    }
}