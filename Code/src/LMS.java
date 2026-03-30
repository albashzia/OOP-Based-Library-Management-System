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
        int choice;
        do{
            System.out.println("---Library Management System---");
            System.out.println("1.Books Menu");
            System.out.println("2.Member Menu");
            System.out.println("3.StudyRoom Menu");
            System.out.println("0.Exit");
            System.out.println("Enter your choice");

            choice=input.nextInt();
            switch(choice){
                case 1: booksMenu();
                    break;
                case 2: membersMenu();
                    break;
                case 3: studyRoomMenu();
                    break;
                case 4:
                    System.out.println("Exiting LMS");
                    break;
                default :
                    System.out.println("Invalid choice!");
                    break;
            }

        } while(choice!=0);


    }
    //Books Menu
    public void booksMenu(){
        int choice;
        do{
            System.out.println("--BOOKS MENU--");
            System.out.println("1.Add Book");
            System.out.println("2.Remove Book");
            System.out.println("3.Display all Books");
            System.out.println("4.Issue Book");
            System.out.println("5.Return Book");
            System.out.println("6.Search Book by ID");
            System.out.println("7.Search Book by Author");
            System.out.println("8.Display Issued Books");
            System.out.println("0.Exit");
            System.out.println("Enter your choice");
            choice=input.nextInt();
            switch(choice){
                case 1: //library.addBook();
                    break;
                case 2: //library.removeBook();
                    break;
                case 3: library.displayAllBooks();
                    break;
                case 4: library.issueBook();
                    break;
                case 5: library.returnBook();
                    break;
                case 6: //library.searchBookByID();
                    break;
                case 7: library.searchBookByAuthor();
                    break;
                case 8: //library.displayIssuedBook();
                    break;
                case 9:
                    System.out.println("Returning to main menu..");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;



            }

        }
        while(choice!=0);


    }
    //Members Menu
    public void membersMenu(){
        int choice;
        do {
            System.out.println("--MEMBER MENU--");
            System.out.println("1.Register Member");
            System.out.println("2.Remove Member");
            System.out.println("3.Search Member by ID");
            System.out.println("4.Search Member by Name");
            System.out.println("5.Display Issued Book by Member");
            System.out.println("6.Display all Members");
            System.out.println("0.Exit");
            System.out.println("Enter your choice");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    //library.registerMember();
                    break;
                case 2:
                    //library.removeMember();
                    break;
                case 3:
                    //library.searchMemberByID();
                    break;
                case 4:
                    //library.searchMemberByName();
                    break;
                case 5:
                    //library.displayIssuedBooksByMember();
                    break;
                case 6:
                    //library.displayAllMembers();
                    break;
                case 7:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }while(choice!=0);

    }
    //Study Room Menu
    public void studyRoomMenu(){
        int choice;
        do{
            System.out.println("--STUDY ROOM MENU--");
            System.out.println("1.Display all Rooms");
            System.out.println("2.Reserve Room");
            System.out.println("3.Cancel Reservation");
            System.out.println("4.Display Room Status");
            System.out.println("0.Exit");
            System.out.println("Enter your choice");
            choice=input.nextInt();

            switch(choice){
                case 1: //library.displayAllRooms();
                    break;
                case 2: //library.reserveRoom();
                    break;
                case 3: //library.cancelReservation();
                    break;
                case 4: //library.displayRoomStatus();
                    break;
                case 5:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;



            }
        }while(choice!=0);

    }
}
