//Create a Book class with ISBN, title and price. Initialize the values using a parameterized constructor.

class Book {
    String isbn;
    String title;
    double price;

    public Book(String isbn, String title, double price) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Price: $" + price);
        System.out.println("-----------------------");
    }
}
public class Main5 {
    public static void main(String[] args) {
        Book book1 = new Book("123", "Java Programming", 90.00);
        Book book2 = new Book("456", "Effective Java", 39.89);
        Book book3 = new Book("789", "Head First Java", 49.00);

        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
    }
}

