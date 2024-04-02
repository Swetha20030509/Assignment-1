package abstractEx;

import java.util.Scanner;

class Book
{
	int id;
	String bookName;
	String authorName;
	int count=0;
	public Book(int i, String bookName, String authorName,int count) {
		this.id=i;
		this.bookName=bookName;
		this.authorName=authorName;
		this.count=count;
	}
	public void updateBookName(String bookName)
	{
			this.bookName=bookName;
	}
	public void updateBookAuthor(String authorName)
	{
		this.authorName=authorName;
	}
	public void updateBookCount(int count)
	{
		this.count=count;
	}
	public void displayBookDetail()
	{
		System.out.println("Book Id "+id);
		System.out.println("Book Name "+bookName);
		System.out.println("Author Name "+authorName);
		System.out.println("Book count "+count);
	}
	
}
public class Bookdemo {
	public boolean isAuthorizedPerson(String username,String password)
	{
		if(username.equals("swetha")&&password.equals("1234"))
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bookdemo bookdemo=new Bookdemo();
		Book book=new Book(1,"java","james",5);
		System.out.println("Enter the user name");
		String userName=sc.nextLine();
		System.out.println("Enter the password");
		String password=sc.nextLine();
		if(bookdemo.isAuthorizedPerson(userName,password))
		{
			System.out.println("1.Update Book");
			System.out.println("2.Exit");
			System.out.println("Enter your choice");
			switch(sc.nextInt())
			{
			case 1:
				bookdemo.menu(book);
				break;
			case 2:
				System.exit(0);
				break;
			}
			
		}
		else
		{
			System.out.println("Invalid username and password");
		}

	}

	private void menu(Book book) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Update book Name");
		System.out.println("2.Update author Name");
		System.out.println("3.Update book count");
		System.out.println("Enter your choice");
		switch (sc.nextInt())
		{
			case 1:
				System.out.println("Enter the book name");
				String bookname=sc.nextLine();
				book.updateBookName(bookname);
				break;
			case 2:
				System.out.println("Enter the author name");
				String authorname=sc.nextLine();
				book.updateBookAuthor(authorname);
				break;
			case 3:
				System.out.println("Enter the book count");
				int count=sc.nextInt();
				book.updateBookCount(count);
				break;
		}

		book.displayBookDetail();
	}

}
