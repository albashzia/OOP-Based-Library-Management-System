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
        if(books.isEmpty()){
            System.out.println("No Books Available");
            return;
        }
        for(Book b: books){
            b.displayBook();
        }
    }

    void issueBook() {
    }

    void returnBook() {
    }

    Book searchBookByID(int id){
        for(Book b:books) {
            if (b.getID() == id) {
                return b;
            }
        }
        return null;
    }

    void searchBookByAuthor(){
    }

    void displayIssuedBooks(){
        if(issuedBooks.isEmpty()){
            System.out.println("No issued books");
            return;
        }
        for(IssuedBook ib:issuedBooks){
            ib.displayIssuedBook();
        }
    }
}
