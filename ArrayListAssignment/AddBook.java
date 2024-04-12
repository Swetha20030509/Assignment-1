package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Scanner;

class Book
{
    private int bookId;
    private String name;
    private String Author_Name;
    private int publicationDate;
    private int count;

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor_Name(String author_Name) {
        Author_Name = author_Name;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getBookId() {
        return bookId;
    }

    public String getName() {
        return name;
    }

    public String getAuthor_Name() {
        return Author_Name;
    }

    public int getCount() {
        return count;
    }
}
public class AddBook {
    ArrayList<Book>allBooks=new ArrayList<>();
    Scanner scanner=new Scanner(System.in);
    static int id=0;
    public void addBook()
    {
        id++;
        System.out.println("Enter the Book name");
        String name=scanner.nextLine();
        System.out.println("Enter the author name");
        String authorName=scanner.nextLine();
        System.out.println("Enter the publication year");
        int year= scanner.nextInt();
        System.out.println("Enter the book count");
        int count=scanner.nextInt();
        Book book=new Book();
        book.setBookId(id);
        book.setName(name);
        book.setAuthor_Name(authorName);
        book.setPublicationDate(year);
        book.setCount(count);
        allBooks.add(book);
        System.out.println(name+"Booked added successfully");
    }
    public static void main(String[] args) {
        AddBook addBook=new AddBook();
       Scanner sc=new Scanner(System.in);
        while(true) {
       System.out.println("1.Add Book");
        System.out.println("2.Update Book");
        System.out.println("3.Remove Book");
        System.out.println("4.Exit");
       System.out.println("Enter your choice");
       String choice= sc.nextLine();

           switch (choice) {
               case "1":
                   addBook.addBook();
                   break;
               case "2":
                   System.out.println(addBook.updateBook());
                   break;
               case "3":
                   System.out.println(addBook.deleteBook());
                   break;
               case "4":
                   System.exit(0);
                   break;
               default:
                   System.out.println("Invalid!!!");
           }
       }

    }

    private String deleteBook() {
        System.out.println("Enter the book id");
        int bookId= scanner.nextInt();
        for(int i=0;i<allBooks.size();i++) {
            if (allBooks.get(i).getBookId()==bookId)
            {
                allBooks.remove(i);
                return "Booked deleted successfull!!";
            }
        }
        return "No books deleted";
    }

    private String updateBook() {
        System.out.println("Enter the book id");
        int bookId= scanner.nextInt();
        for(int i=0;i<allBooks.size();i++) {
            if (allBooks.get(i).getBookId()==bookId)
            {
                System.out.println("Enter the Book count");
                int count=scanner.nextInt();
                allBooks.get(i).setCount(count);
                return "Booked update successfully!!";
            }
        }
        return "No books updated";
    }
}
