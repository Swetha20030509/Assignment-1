package com.swetha.librarymanagement.datalayer;

import java.util.ArrayList;

import com.swetha.librarymanagement.model.Book;
import com.swetha.librarymanagement.model.Library;
import com.swetha.librarymanagement.model.User;
import com.swetha.librarymanagement.model.GetBook;

public class Librarydatabase {
	private Library library;
	private User currentUser;
	private static Librarydatabase librarydatabase;
	private ArrayList<Book> allBooks=new ArrayList<>();
	private ArrayList<User> userList=new ArrayList<>();
	private ArrayList<GetBook>borrowedBook=new ArrayList<>();
	public static Librarydatabase getInstance()
	{
		if(librarydatabase==null)
		{
			librarydatabase=new Librarydatabase();
		}
		return librarydatabase;
	}
	public Library insertLibrary(Library library2) {
		this.library = library2;
		this.library.setLibraryId(1);
		return library;
	}
	
	public boolean insertBook(Book book) {
		boolean flag=allBooks.add(book);
		System.out.println(allBooks);
		return flag;
		
	}
	public boolean removeBook(String book) {
		for(int i=0;i<allBooks.size();i++)
		{
			if(allBooks.get(i).getBookName().equals(book))
			{
				 allBooks.remove(i);
				 return true;
			}
		}
		return false;
		
	}
	public ArrayList<Book> searchBook(String name) {
		ArrayList<Book> findBook=new ArrayList<>();
		
		for(Book book :allBooks)
		{
			if(book.getBookName().startsWith(name))
			{
				findBook.add(book);
			}
		}
		return findBook;
	}
	public ArrayList<Book> getAllBooks() {
		return allBooks;
	}
	public boolean insertUser(User newUser) {
		return userList.add(newUser);
	}
	public Book findBook(String bookname) {
		for(Book book :allBooks)
		{
			if(book.getBookName().equals(bookname))
			{
				return book;
			}
		}
		return null;
	}
	public User isUser(String name, String password) {
		for(User user :userList)
		{
			if(user.getName().equals(name)&&user.getPassword().equals(password))
			{
				return user;
			}
		}
		return null;
	}

	public void addBorrowedBook(Book book) {
		GetBook getBook=new GetBook(book,currentUser);
		borrowedBook.add(getBook);
	}

	public void updateCurrentUser(User currentUser) {
		this.currentUser=currentUser;
	}

	public ArrayList<GetBook> getBorrowedBook() {
		return borrowedBook;
	}
	public boolean returnBook(Book book)
	{
		for(int i=0;i<borrowedBook.size();i++)
		{
		if(currentUser.getEmail().equals(borrowedBook.get(i).getUser().getEmail())&&book.getBookName().equals(borrowedBook.get(i).getBook().getBookName())&&!borrowedBook.get(i).getStatus())
		{
			return true;
		}
		}
		return false;
	}
}
