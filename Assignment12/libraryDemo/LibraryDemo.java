package Assignment12.libraryDemo;

import Assignment12.library.Book;
import Assignment12.library.Members;
import Assignment12.library.Transactions;

public class LibraryDemo {

	public static void main(String[] args) {
		Book book=new Book("java","james","1");
		Members mem=new Members("swetha",23);
		Transactions transaction=new Transactions(book,mem,12);
		System.out.println("**********BOOK DETAIL***********");
		System.out.println("Book name :"+book.getName());
		System.out.println("Author name :"+book.gerAythorName());
		System.out.println("Book id :"+book.getId());
		System.out.println("**********Transaction DETAIL***********");
		System.out.println("Transaction is :"+transaction.getId());
		System.out.println("Book name :"+transaction.getbook().getName());

	}

}
