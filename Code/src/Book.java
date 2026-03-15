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
        if(availableQuantity > 0){
            availableQuantity--;
            System.out.println("Book issued successfully.");
        }
        else{
            System.out.println("No copies available.");
        }
    };

    void returnCopy(){
        if(availableQuantity < totalQuantity){
            availableQuantity++;
            System.out.println("Book returned successfully.");
        }
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
