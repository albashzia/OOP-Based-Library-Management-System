import java.util.ArrayList;

public class Library
{
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<IssuedBook> issuedBooks = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
        System.out.println("Book added.");
    }

    void removeBook() {
    }

    void displayAllBooks() {
    }

    void issueBook() {
    }

    void returnBook() {
    }

    void searchBookByID(){
    };

    void searchBookByAuthor(){
    };

    void displayIssuedBooks(){
    };
}
