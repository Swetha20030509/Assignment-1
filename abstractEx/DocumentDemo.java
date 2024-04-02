package abstractEx;

import javax.swing.text.Document;

abstract class Documents
{
    String name;
    int size;

    public Documents(String name, int size) {
        this.name=name;
        this.size=size;
    }

    public abstract String getType();
    public abstract void display();
}
class PDFDocument extends Documents
{
    String author;

    public PDFDocument(String name, int size, String author) {
        super(name,size);
        this.author=author;
    }

    public String getType()
    {
        return "pdf document";
    }

    @Override
    public void display() {
        System.out.println(name+"............."+author);
    }
}
class TextDocument extends Documents
{
    String content;

    public TextDocument(String name, int size, String content) {
        super(name,size);
        this.content=content;
    }

    public String getType()
    {
        return "text document";
    }
    public void display() {
        System.out.println(name+"............."+content);
    }
}
class ImageDocument extends Documents
{
    String resoluation;

    public ImageDocument(String name, int size, String resoluation) {
        super(name,size);
        this.resoluation=resoluation;
    }

    public String getType()
    {
        return "image document";
    }
    public void display() {
        System.out.println(name+"............."+resoluation);
    }
}
public class DocumentDemo {
    public static void main(String[] args) {
        Documents documents=new PDFDocument("sample.pdf",32,"aruna");
        System.out.println(documents.getType());
        documents.display();
        Documents documents1=new TextDocument("sample.txt",32,"this is paragraph");
        System.out.println(documents1.getType());
        documents1.display();
        Documents documents2=new ImageDocument("sample.jpg",32,"12X12");
        System.out.println(documents2.getType());
        documents2.display();
    }
}
