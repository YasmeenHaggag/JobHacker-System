package com.oop;
import java.util.ArrayList;
public class Book extends Library {
   String bookTitle;
   String authorName;
   String bookID;
   String bookVersion;
   boolean bookAvailabilityStatus;
    ArrayList<String> AutherName = new ArrayList<String>();
    ArrayList<String> BookID = new ArrayList<String>();
    ArrayList<String> BookVresion = new ArrayList<String>();
    ArrayList<String> borrowedBooks = new ArrayList<String>();

   public void addBook(String bookTitle,String authorName,
                       String bookID,String bookVersion){
       this.bookTitle=bookTitle;
       this.authorName=authorName;
       this.bookID=bookID;
       this.bookVersion=bookVersion;
       books.add(bookTitle);
       AutherName.add(authorName);
       BookID.add(bookID);
       BookVresion.add(bookVersion);
   }
   public void removeBook(String bookTitle,String authorName,
                          String bookID,String bookVersion){
       books.remove(bookTitle);
       AutherName.remove(authorName);
       BookID.remove(bookID);
       BookVresion.remove(bookVersion);
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
