/*
========================================
        LIBRARY MANAGEMENT SYSTEM
========================================

1. Add Book
2. Display All Books
3. Search Book
4. Issue Book
5. Return Book
6. Update Book
7. Delete Book
8. Show Library Statistics
9. Exit

Enter your choice:
 */

package project;

import java.util.Scanner;

public class LibraryManagementSystem {
    static int index = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Book[] books = new Book[100];
        while ( true ){
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Update Book");
            System.out.println("7. Delete Book");
            System.out.println("8. Show Library Statistics");
            System.out.println("9. Exit");
            int choice = in.nextInt();

            if (choice == 1) {
                addBook(books , in);
            } else if (choice ==2) {
                displayAllBook(books);
            }
            else if (choice == 3) {
                SearchBook(books ,in);
            }
            else if (choice == 4) {
                IssueBook( books , in);
            }
            else if (choice == 5) {
                ReturnBook(books , in);

            }
            else if (choice == 6) {
                UpdateBook(books , in);
            }
            else if (choice == 7) {
                DeleteBook(books , in);
            }
            else if (choice == 8) {
                ShowLibraryStatistics(books ,in);
            }
            else  if (choice == 9) {
                break;
            }
            else {
                System.out.println("Invalid choice");
            }

        }
    }
    static void addBook(Book[] books , Scanner in ){
        in.nextLine();
        System.out.println("Enter Book ID");
        int bookID = in.nextInt();
        in.nextLine();

        System.out.println("enter the Title of the book:");
        String title = in.nextLine();

        System.out.println("enter the author of the book:");
        String author = in.nextLine();


        System.out.println("enter the price of the book:");
        float price =  in.nextFloat();

        boolean issued = false;
        books[index] = new Book(bookID , title , author , price , issued);
        index++;
    }
    static void displayAllBook(Book[] books){
        for(int i =  0; i < index; i++){
            books[i].displayBook();
        }
    }
    static void  SearchBook(Book[] books , Scanner in){
        in.nextLine();
        System.out.println("Enter Book ID");
        int bookID = in.nextInt();
        boolean found = false;
        for (int i =  0; i < index; i++){
            if(books[i].bookId == bookID){
                books[i].displayBook();
                found = true;
            }
        }
        if (!found){
            System.out.println("Book ID not found!");
        }
    }
    static void IssueBook(Book[] books , Scanner in){
        in.nextLine();
        System.out.println("Enter Book ID");
        int bookID = in.nextInt();
        boolean found = false;
        boolean status = false;
        for (int i =  0; i < index; i++){
            if(books[i].bookId == bookID){
                found = true;
                if(!books[i].issued){
                    books[i].issued = true;
                    System.out.println("Book issued successfully!");
                    status = true;
                }
            }
        }
        if(!found){
            System.out.println("Book ID not found!");
        }
        if(!status){
            System.out.println("Book is already issued!");
        }
    }
    static void ReturnBook(Book[] books , Scanner in){
        in.nextLine();
        System.out.println("Enter Book ID");
        int bookID = in.nextInt();
        boolean ststus = false;
        for(int i =  0; i < index; i++){
            if(books[i].bookId == bookID){
                books[i].issued = false;
                ststus = true;
                System.out.println("Book returned successfully!");
            }
        }
        if(!ststus){
            System.out.println("Book was not issued!");
        }
    }
    static void UpdateBook(Book[] books , Scanner in){
        in.nextLine();
        System.out.println("Enter Book ID");
        int bookID = in.nextInt();
        boolean ststus = false;
        for(int i =  0; i < index; i++){
            if(books[i].bookId == bookID){
                System.out.println("Enter Book Title");
                String title = in.nextLine();
                books[i].changeAuthor(title);

                System.out.println("Enter Book Author");
                String author = in.nextLine();
                books[i].changeAuthor(author);

                System.out.println("Enter Book Price");
                float price = in.nextFloat();
                books[i].changePrice(price);
            }
        }
    }
    static void DeleteBook(Book[] books , Scanner in){
        in.nextLine();
        System.out.println("Enter Book ID");
        int bookID = in.nextInt();
        boolean ststus = false;
        for (int i = 0; i < index; i++) {
            if (books[i].bookId== bookID) {

                for (int j = i; j < index - 1; j++) {
                    books[j] = books[j + 1];
                }
                index--;
                books[index] = null;

                ststus = true;
                System.out.println("Book deleted successfully!");
                break;
            }
        }
        if(!ststus){
            System.out.println("Book ID not found!");
        }
    }
    static void ShowLibraryStatistics(Book[] books , Scanner in){
        int total = index ;
        int AvailableBooks = 0;
        int IssuedBooks =  0;
        float MostExpensive = 0.0f;
        float AveragePrice = 0.0f;
        for (int i =  0; i < index; i++){
            if(books[i].issued){
                IssuedBooks++;
            }
            if(!books[i].issued){
                AvailableBooks++;
            }
            if(books[i].price > MostExpensive){
                MostExpensive = books[i].price;
            }
            AveragePrice += books[i].price;
        }
        AveragePrice = AveragePrice / index;
        System.out.println("========== LIBRARY STATISTICS ==========");
        System.out.println("Total Books:  " + total);
        System.out.println("Available Books:  " + AvailableBooks);
        System.out.println("Most Expensive Books:  " + MostExpensive);
        System.out.println("Average Books:  " + AveragePrice);

    }
}
class Book {
    int bookId;
    String title;
    String author;
    float price;
    boolean issued;

    Book(int bookId, String title, String author, float price, boolean issued){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.issued = issued;
    }
    void changeTitle(String title) {
        this.title = title;
    }
    void changeAuthor(String author) {
        this.author = author;
    }
    void changePrice(float price) {
        this.price = price;
    }
    void changeIssued(boolean issued) {
        this.issued = issued;
    }
    void displayBook(){
        System.out.println("Book Id:"+this.bookId);
        System.out.println("Book Title:"+this.title);
        System.out.println("Book Author:"+this.author);
        System.out.println("Book Price:"+this.price);
        System.out.println("Book Issued:"+this.issued);

    }

}
