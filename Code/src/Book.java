public class Book {

    // Attributes

    private int id;
    private String title;
    private String author;
    private int totalQuantity;
    private int availableQuantity;

    //Parameterized Constructor
    Book(int id, String title, String author, int qty) {

        this.id = id;
        this.title = title;
        this.author = author;
        this.totalQuantity = qty;
        this.availableQuantity = qty;
    }

    // Method to decrement the number of copies upon being called
    void issueCopy(){
        if(availableQuantity > 0){
            availableQuantity--;
            System.out.println("Book issued successfully.");
        }
        else{
            System.out.println("No copies available.");
        }
    };

    // Method to increment the number of copies upon being called
    void returnCopy(){
        if(availableQuantity < totalQuantity){
            availableQuantity++;
            System.out.println("Book returned successfully.");
        }
    };

    void displayBook(){
        System.out.println("Book ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available Copies: " + availableQuantity);
        System.out.println("-------------------------");
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
