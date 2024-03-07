package Assignment7;

public class Product {

	String productName;
	int productId;
	double amount;
	boolean status;
	Product(String productName,int productId,double amount,boolean status)
	{
		this.productName=productName;
		this.productId=productId;
		this.status=status;
		this.amount=amount;
	}
	public void display()
	{
		System.out.println("productName :"+productName);
		System.out.println("productId :"+productId);
		System.out.println("amount :"+amount);
		System.out.println("status :"+status);
	}
	public static void main(String[] args) {
		Product product1=new Product("laptop",123,40000,true);
		product1.display();

	}

}
