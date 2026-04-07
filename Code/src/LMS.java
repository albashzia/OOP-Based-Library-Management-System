import java.util.Scanner;

public class LMS {
    Scanner input;
    Library library;

    //constructor
    public LMS(){
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
            System.out.println();
            System.out.println("---Library Management System---");
            System.out.println("1.Books Menu");
            System.out.println("2.Member Menu");
            System.out.println("3.StudyRoom Menu");
            System.out.println("0.Exit");
            System.out.print("Enter your choice : ");
            choice=input.nextInt();
            switch(choice){
                case 1:
                    System.out.println();
                    booksMenu();
                    break;
                case 2:
                    System.out.println();
                    membersMenu();
                    break;
                case 3:
                    System.out.println();
                    studyRoomMenu();
                    break;
                case 0:
                    System.out.println();
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
            System.out.println();
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
            System.out.print("Enter your choice : ");
            choice=input.nextInt();
            switch(choice){
                case 1:
                    System.out.println();
                    System.out.print("Enter Book ID: ");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter Title: ");
                    String title = input.nextLine();
                    System.out.print("Enter Author: ");
                    String author = input.nextLine();
                    System.out.print("Enter Quantity: ");
                    int qty = input.nextInt();
                    Book book = new Book(id, title, author, qty);
                    library.addBook(book);
                    break;

                case 2:
                    System.out.println();
                    System.out.print("Enter Book ID to remove: ");
                    int removeId = input.nextInt();
                    library.removeBook(removeId);
                    break;
                case 3:
                    System.out.println();
                    library.displayAllBooks();
                    break;
                case 4:
                    System.out.println();
                    library.issueBook();
                    break;
                case 5:
                    System.out.println();
                    library.returnBook();
                    break;
                case 6:
                    System.out.println();
                    System.out.print("Enter Book ID: ");
                    int searchId = input.nextInt();
                    Book found = library.searchBookByID(searchId);
                    if (found != null) found.displayBook();
                    else System.out.println("Book not found.");
                    break;
                case 7:
                    System.out.println();
                    library.searchBookByAuthor();
                    break;
                case 8:
                    System.out.println();
                    System.out.println();
                    library.displayIssuedBooks();
                    break;
                case 0:
                    System.out.println();
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
                System.out.println();
                System.out.println("--MEMBER MENU--");
                System.out.println("1.Register Member");
                System.out.println("2.Remove Member");
                System.out.println("3.Search Member by ID");
                System.out.println("4.Search Member by Name");
                System.out.println("5.Display Issued Book by Member");
                System.out.println("6.Display all Members");
                System.out.println("0.Exit");
                System.out.print("Enter your choice : ");
                choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println();
                        System.out.println("Enter member ID:");
                        String id=input.nextLine();
                        System.out.println("Enter member name :");
                        String name=input.nextLine();
                        System.out.println("Enter phone number :");
                        String phone=input.nextLine();
                        System.out.println("Enter email:");
                        String email=input.nextLine();
                        library.registerNewMember(id,name,phone,email);
                        break;
                    case 2:
                        System.out.println();
                        System.out.println("Enter member ID:");
                        String remid=input.nextLine();
                        library.removeMember(remid);
                        break;
                    case 3:
                        System.out.println();
                        System.out.println("Enter member ID:");
                        String sid=input.nextLine();
                        library.searchMemberById(sid);
                        break;
                    case 4:
                        System.out.println();
                        System.out.println("Enter member name:");
                        String memName=input.nextLine();
                        library.searchMemberByName(memName);
                        break;
                    case 5:
                        System.out.println();
                        library.viewBooksIssuedByAMember();
                        break;
                    case 6:
                        System.out.println();
                        library.displayAllMembers();
                        break;
                    case 0:
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
            System.out.println();
            System.out.println("--STUDY ROOM MENU--");
            System.out.println("1.Display all Rooms");
            System.out.println("2.Reserve Room");
            System.out.println("3.Cancel Reservation");
            System.out.println("0.Exit");
            System.out.print("Enter your choice : ");
            choice=input.nextInt();

            switch(choice){
                case 1:
                    System.out.println();


                    library.displayRoomStatus();
                    break;
                case 2:
                    System.out.println("Enter room number :");
                    int roomNum=input.nextInt();
                    input.nextLine();

                    System.out.println("Enter member ID : ");
                    String memID=input.nextLine();

                    System.out.println();
                    library.reserveRoom(roomNum,memID);
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Enter room number  :");
                    int roomNumber=input.nextInt();
                    input.nextLine();

                    System.out.println("Enter member ID : ");
                    String memberID=input.nextLine();
                    library.cancelReservation(roomNumber,memberID);
                    break;

                case 0:
                    System.out.println("Returning to main menu...");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;



            }
        }while(choice!=0);

    }
}