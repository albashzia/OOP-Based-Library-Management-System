public class Book {

    // Attributes
    private int id;
    private String title;
    private String author;
    private int totalQuantity;
    private int availableQuantity;

    //Default Constructor
    Book(){
        this.id = 0;
        this.title = "Not assigned";
        this.author = "Unknown";
        this.totalQuantity = 0;
        this.availableQuantity = 0;
    }

    //Parameterized Constructor
    Book(int id, String title, String author, int qty)
    {
        this.id = id;
        this.title = title;
        this.author = author;
        this.totalQuantity = qty;
        this.availableQuantity = qty;
    }

    // Method to decrement the number of copies upon being called
    void issueCopy()
    {
        if(availableQuantity > 0){
            availableQuantity--;
            System.out.println("Book issued successfully.");
        }
        else
        {
            System.out.println("No copies available.");
        }
    }

    // Method to increment the number of copies upon being called
    void returnCopy()
    {
        if(availableQuantity < totalQuantity){
            availableQuantity++;
            System.out.println("Book returned successfully.");
        }
    }

    //Method to display book details
    void displayBook()
    {
        System.out.println("Book ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available Copies: " + availableQuantity);
        System.out.println("-------------------------");
    }

    //Setter Methods

    void setTitle(String title){
        this.title = title;
    }

    void setAuthor(String author){
        this.author = author;
    }

    void setTotalQuantity(int totalQuantity){
        this.totalQuantity = totalQuantity;
    }

    // Getter Methods

    //returns id
    int getID()
    {
        return id;
    }
    //returns title
    String getTitle()
    {
        return title;
    }
    //returns author
    String getAuthor()
    {
        return author;
    }
    //returns available quantity
    int getAvailableQuantity()
    {
        return availableQuantity;
    }
}