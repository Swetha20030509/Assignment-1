package arraylistAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

class Product
{
    private String productName;
    private Date purchaseDate;
    private int purchaseCount;

    public String getProductName() {
        return productName;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    Product(String productName, Date purchaseDate, int purchaseCount)
    {
        this.productName=productName;
        this.purchaseDate=purchaseDate;
        this.purchaseCount=purchaseCount;
    }
}
class ProductNameCompartor implements Comparator<Product>
{
    public int compare(Product p1, Product p2) {
        return p1.getProductName().compareTo(p2.getProductName());
    }
}
class purchaseDateCompartor implements Comparator<Product>
{
    public int compare(Product p1, Product p2) {
        return p1.getPurchaseDate().compareTo(p2.getPurchaseDate());
    }
}
class purchaseCountCompartor implements Comparator<Product>
{
    public int compare(Product p1, Product p2) {
        return Integer.compare(p1.getPurchaseCount(),p2.getPurchaseCount());
    }
}
public class CustomCompartor {
    static ArrayList<Product>allproduct=new ArrayList<>();
    static void display()
    {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("       PRODUCT NAME          "+"          DATE      "+"       COUNT       ");
        for(int j=0;j<allproduct.size();j++)
        {
            System.out.println(allproduct.get(j).getProductName()+"      "+allproduct.get(j).getPurchaseDate()+"       "+allproduct.get(j).getPurchaseCount());
        }
        System.out.println("---------------------------------------------------------------------");
    }
    public static void main(String[] args) {

        Product product1=new Product("Laptop",new Date(2000,11,2),2);
        Product product2=new Product("Mobile",new Date(2020,10,12),5);
        Product product3=new Product("dress",new Date(2024,4,12),2);
        allproduct.add(product1);
        allproduct.add(product2);
        allproduct.add(product3);
        System.out.println("BEFORE SORTING");
        display();
        System.out.println("PRODUCT NAME SORTING");
        Collections.sort(allproduct, new ProductNameCompartor());
        display();
        System.out.println("PURCHASE DATE SORTING");
        Collections.sort(allproduct, new purchaseDateCompartor());
        display();
        System.out.println("PURCHASE COUNT SORTING");
        Collections.sort(allproduct, new purchaseCountCompartor());
        display();

    }
}
