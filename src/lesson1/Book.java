package lesson1;

public class Book {
    public String id;
    public String title;
    public double price;
    public Author author;

    public Book(String id, String title, double price, Author author) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "lesson1.Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", author=" + author +
                '}';
    }
}



