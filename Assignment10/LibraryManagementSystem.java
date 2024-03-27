package Assignment10;

import java.util.ArrayList;
import java.util.List;

class User
{
    String name;
    int id;
    Account account;
    List<Book> borroedBooks;
    public void verify()
    {

    }
    public void bookInfo()
    {

    }
    public void checkAccount()
    {

    }
}
class Staff extends User
{
    String dept;
}
class Students extends User
{
    String std;

    public Students(String name, String phoneNumber) {
        super();
    }
}
class Account
{
    int no_borrowBooks;
    int noReservedBooks;
    int noReturnBooks;
    int noLostBooks;
    double fineAmount;
    public void calculateFine()
    {

    }
}
class Book
{
    String title;
    String author;
    int Isbn;
    short publication;
    public void show_duedt()
    {

    }
    public void reservationStatus()
    {

    }
    public void feedback()
    {

    }
    public void BookRequest()
    {

    }
}
class Librarian
{
    String name;
    int id;
    int password;
    String search;
    List<Book> allbook;
    public void verifyLibrarian()
    {

    }
    public void search()
    {

    }
}
class LibraryDatabase
{
    List<Book> allBooks=new ArrayList<>();
    List<Account> allAccounts;
    Librarian librarian;
    public void add()
{

}
public void delete()
{

}
public void update()
{

}
public void display()
{

}
public void search()
{

}
}
public class LibraryManagementSystem {
    String userType;
    String username;
    String password;
    Librarian librarian;
    List<User> allUser;
    List<Book> allBook;
}
