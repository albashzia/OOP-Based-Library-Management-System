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

}
