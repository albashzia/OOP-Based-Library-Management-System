import java.util.ArrayList;

public class Library
{
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<IssuedBook> issuedBooks = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
        System.out.println("Book added.");
    }

    void removeBook(int id) {
        for(Book b:books){
            if(b.getID()==id){
                books.remove(b);
                System.out.println("Book Removed");
            }
            return;
        }
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
