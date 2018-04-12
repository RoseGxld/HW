package book;

public class Main {
    public static void main(String[] args) {

     Book b1 = new Book("Harry Potter",59.99,6,new Author("JK Rowling","jkrowling.com",'F' ));
        System.out.println(b1);

        b1.invoiceFrom();


    }
}
