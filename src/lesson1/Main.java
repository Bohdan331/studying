package lesson1;

public class Main {
    public static void main(String[] args) {
        Book[] books = BookDatabase.getAllBooks();
        printBooks(books);

        Book book = BookDatabase.findBookByAuthorFullName("Author2");
        System.out.println(book);
    }

    private static void printBooks(Book[] books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

//    Написати програму:
//        Є клас lesson1.Book, який має властивості id, title, price and author. lesson1.Author це також клас який має властивості fullName, age.
//        Зробити клас по типу бази даних. В цьому класі будуть публічні статичні методи:
//        lesson1.Book[] getAllBooks();
//
//        lesson1.Book findBookByAuthorFullName(String fullName)

//        lesson1.Book[] findBooksByAuthorFullName(String fullName)
//
//        lesson1.Book findBookById(int id);
//
//        lesson1.Book[] findAllBooksByFirstThreeLettersInTitle(String firstThreeLetters);
//
//        lesson1.Book[] getAllBooksInByMinAndMaxPrice(int minPrice, int maxPrice);
//
//        lesson1.Author[] getAllAuthors();

//    Програма на початку пише якесь привітання і пропонує юзеру декілька варіантів команд:
//        GET_ALL_BOOKS,
//        FIND_BOOK_BY_AUTHOR_FULL_NAME,
//        ....
//
//        Юзер вибрав якийсь варіант і відносно того вибору система пропонує або зразу результат( в GET_ALL_BOOKS), або пропонує вибрати фуллНейм (у випадку FIND_BOOK_BY_AUTHOR_FULL_NAME), або вибрати мінімальну і максимальну ціну.
//        І система показує результат.
//
//        Юзер може вибирати ці команди скільки забажає разів.
//        Якщо юзер вибирає команду EXIT, то він виходить з програми