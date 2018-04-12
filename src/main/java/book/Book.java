package book;

public class Book {

    private String name;
    private Author author;
    private double price;
    private int quantity;



    public Book(String name, double price, int quantity, Author author){
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;


    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    private double getInvoice(){
        return 25.0;
    }

    public void invoiceFrom(){
        System.out.println(getInvoice());

    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + new Author("Jk Rowling","Jkrowling.com",'f') +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }


    }

