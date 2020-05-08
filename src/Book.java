import java.util.Comparator;

public class Book  {
    private int bookCode;
    private String name;
    private double price;
    private String author;
    private static int nextId=1;
    public Book(){

    }

    {
        this.bookCode=nextId;
        nextId++;
    }
    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public int getBookCode() {
        return this.bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public String toString(){
        return "[Name: "+this.getName()+" , Price:"+this.getPrice()+" ,Author: "+this.getAuthor()+" ]";
    }



}
