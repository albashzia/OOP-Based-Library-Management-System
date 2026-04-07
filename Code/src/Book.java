public class Book {

    // Attributes
    private int id;
    private String title;
    private String author;
    private int totalQuantity;
    private int availableQuantity;

    //Default Constructor
    public Book() {
        this.id = 0;
        this.title = "Not assigned";
        this.author = "Unknown";
        this.totalQuantity = 0;
        this.availableQuantity = 0;
    }

    //Parameterized Constructor
    public Book(int id, String title, String author, int qty) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.totalQuantity = qty;
        this.availableQuantity = qty;
    }

    // Method to decrement the number of copies upon being called
    public void issueCopy() {
        if (availableQuantity > 0) {
            availableQuantity--;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("No copies available.");
        }
    }

    // Method to increment the number of copies upon being called
    public void returnCopy() {
        if (availableQuantity < totalQuantity) {
            availableQuantity++;
            System.out.println("Book returned successfully.");
        }
    }

    //Method to display book details
    public void displayBook() {
        System.out.println("Book ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available Copies: " + availableQuantity);
        System.out.println("-------------------------");
    }

    //Setter Methods

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    // Getter Methods

    //returns id
    public int getID() {
        return id;
    }

    //returns title
    public String getTitle() {
        return title;
    }

    //returns author
    public String getAuthor() {
        return author;
    }

    //returns total quantity
    public int getTotalQuantity() {
        return totalQuantity;
    }

    //returns available quantity
    public int getAvailableQuantity() {
        return availableQuantity;
    }

}