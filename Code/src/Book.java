public class Book {
    int id;
    String title;
    String author;
    int totalQuantity;
    int availableQuantity;

    Book(int id, String title, String author, int qty) {

        this.id = id;
        this.title = title;
        this.author = author;
        this.totalQuantity = qty;
        this.availableQuantity = qty;
    }

    void issueCopy(){

    };

    void returnCopy(){

    };

    void displayBook(){

    };

    int getID(){
        return id;
    };

    String getTitle(){
        return title;
    };

    String getAuthor() {
        return author;
    };

    int getAvailableQuantity(){
        return availableQuantity;
    };

}
