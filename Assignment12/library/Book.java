package Assignment12.library;

public class Book {
	String bookid;
	String bookName;
	String authorName;
	public Book(String bookName, String authorName, String id) {
		this.bookName=bookName;
		this.authorName=authorName;
		this.bookid=id;
	}
	public String getId()
	{
		return bookid;
	}
	public String getName()
	{
		return bookName;
	}

	public String gerAythorName()
	{
		return authorName;
	}

}
