import java.util.Scanner;

public class LMS {
    private Scanner input;
    private Library library;

    //constructor
    LMS(){
        input=new Scanner(System.in);
        library= new Library();

    }
    //Main Method
    public static void main(String args[]){
       LMS system=new LMS();
       system.displayMainMenu();
    }
    //Main Menu
    public void displayMainMenu(){


  }
  //Books Menu
    public void booksMenu(){

   }
   //Members Menu
    public void membersMenu(){

   }
   //Study Room Menu
    public void studyRoomMenu(){

   }
}
