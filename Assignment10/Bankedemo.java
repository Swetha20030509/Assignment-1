package Assignment10;

import java.awt.print.Book;
import java.util.Scanner;

class Books
{
    private int isbn;
    private String bookName;
    private String authorName;
    private int bookCount;
    public Books(int isbn,String bookName,String authorName,int bookCount)
    {
        this.authorName=authorName;
        this.isbn=isbn;
        this.bookName=bookName;
        this.bookCount=bookCount;
        this.isbn=isbn;
    }

    public int getBookCount() {
        return bookCount;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public int getIsbn() {
        return isbn;
    }
}

public class Bankedemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of books added");
        int bookSize=sc.nextInt();
        int index=0;
        Books[] books=new Books[bookSize];
        while(bookSize>index) {
            System.out.println("Enter the book name");
            String bookName = sc.next();
            System.out.println("Enter the author name");
            String authorName = sc.next();
            System.out.println("Enter the book count");
            int count = sc.nextInt();
            System.out.println("Enter the isbn number");
            int isbn = sc.nextInt();
            Books book = new Books(isbn, bookName, authorName, count);
            books[index]=book;
            index++;
            System.out.println("Book Details is added");
        }
        System.out.println("******Book Detail**********");
        System.out.println("BOOK NAME    "+"AUTHOR NAME     "+"BOOK COUNT");
        for(int i=0;i<books.length;i++)
        {
            System.out.println(books[i].getBookName()+"   "+books[i].getAuthorName()+"   "+books[i].getBookCount());
        }

    }
}
