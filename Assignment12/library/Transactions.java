package Assignment12.library;

public class Transactions {
	Book book;
	Members member;
	int transactionId;
	public Transactions(Book book2, Members mem, int i) {
		this.book=book2;
		this.member=mem;
		this.transactionId=i;
	}
	public Book getbook()
	{
		return book;
	}
	public Members getMembers()
	{
		return member;
	}
	public int getId()
	{
		return transactionId;
	}

}
