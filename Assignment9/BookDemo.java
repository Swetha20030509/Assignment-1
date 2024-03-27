package Assignment9;

import java.util.Scanner;

class Book
{
    String tittle;
    String author;
    int count;
    static int Isbn;
    static int bookId;
    public void setTittle(String tittle)
    {
        this.tittle=tittle;
    }
    public void setAuthor(String author)
    {
        this.author=author;
    }
    public void setCount(int count)
    {
        this.count=count;
    }
    public void setIsbn()
    {
        this.Isbn=Isbn++;
    }
    public void setBookId()
    {
        this.bookId=bookId++;
    }
    public String getTittle()
    {
        return tittle;
    }
    public String getAuthor()
    {
        return author;
    }
    public int getCount()
    {
        return count;
    }
    public int getIsbn()
    {
        return Isbn;
    }
    public int getBookId()
    {
        return bookId;
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the book name");
        String bookName=sc.nextLine();
        System.out.println("Enter the author name");
        String author= sc.nextLine();
        System.out.println("Enter the book count");
        int count= sc.nextInt();
        Book book=new Book();
        book.setTittle(bookName);
        book.setAuthor(author);
        book.setCount(count);
        book.setBookId();
        book.setIsbn();
        System.out.println("BOOK DETAIL");
        System.out.println("Book Name :"+book.getTittle());
        System.out.println("Book Id :"+book.getBookId());
        System.out.println("ISBN Id :"+book.getIsbn());
        System.out.println("Author Name :"+book.getAuthor());
        System.out.println("Available Count :"+book.getCount());
    }


}
