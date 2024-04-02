package abstractEx;

import java.util.ArrayList;

abstract class Product
{
         String productName;
         double price;

    public Product(String productName, int price) {
        this.productName=productName;
        this.price=price;
    }

    public double getPrice()
    {
        return price;
    }
        public abstract String getDescription();

}
class  ElectronicsProduct extends Product
{
    String brand;
    int starRating;

    public ElectronicsProduct(String led, int i, String led1, int starRating) {
        super(led,i);
        this.brand=led1;
        this.starRating=starRating;
    }
    public String getDescription()
    {
        System.out.println("*************Electronics DETAIL**********");
        return productName+" by "+brand;
    }
}
class ClothingProduct extends Product
{
    int size;
    public ClothingProduct(String productName, int price, int size) {
        super(productName,price);
        this.size=size;
    }
    public String getDescription()
    {
        System.out.println("*************CLOTH DETAIL**********");
        return productName+" by "+size;
    }
}
class BookProduct extends  Product
{
    String publication;

    public BookProduct(String bookName, int price, String publication) {
        super(bookName,price);
        this.publication=publication;
    }
    public String getDescription()
    {
        System.out.println("*************BOOK DETAIL**********");
        return productName+" by "+publication;
    }
}
public class ShoppingCardDemo {
    public Long calculatePrice(ArrayList<Product> products)
    {
        long totalPrice=0;
        for(int i=0;i<products.size();i++)
        {
            totalPrice+=products.get(i).getPrice();
        }
        return  totalPrice;
    }
    public static void main(String[] args) {
        ArrayList<Product> products=new ArrayList<Product>();
    Product electronicsProduct=new ElectronicsProduct("LED",100,"led",4);
    electronicsProduct.getDescription();
    Product clothingProduct=new ClothingProduct("legaha",1000,38);
    clothingProduct.getDescription();
    Product bookProduct=new BookProduct("java programming",100,"abc publication");
    bookProduct.getDescription();
    products.add(electronicsProduct);
    products.add(clothingProduct);
    products.add(bookProduct);
        ShoppingCardDemo shoppingCardDemo=new ShoppingCardDemo();
        System.out.println("Total amount :"+shoppingCardDemo.calculatePrice(products));
    }
}
