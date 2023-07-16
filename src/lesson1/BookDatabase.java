package lesson1;

public class BookDatabase {
    public static Book[] getAllBooks() {
        Author author1 = new Author("Author1", 37);
        Author author2 = new Author("Author2",23);
        return new Book[]{new Book("q1", "Думай і багатій", 230.20, author1),
                new Book("q2", "Маленьке життя", 900,author1),
                new Book("q3", "Найбагатший чоловік у Вавилоні", 262, author2)};
    }

    public static Book findBookByAuthorFullName(String fullName) {
        Book[] books = getAllBooks();
        Book bookResult = null;
        for (Book book : books) {
            if (book.author.fullName.equals(fullName)){
                bookResult = book;
            }
        }
        return bookResult;
    }
    public static Book findBookById(String id){
        Book[] books = getAllBooks();
        Book bookId = null;
        for (Book book : books){
            if (book.id.equals(id)){
                bookId = book;
            }
        }
        return bookId ;
    }

}
