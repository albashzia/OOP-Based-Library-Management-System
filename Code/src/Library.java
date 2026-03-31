import java.util.Scanner;
import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;
    ArrayList<IssuedBook> issuedBooks ;
    ArrayList<Member>members;
    ArrayList<StudyRoom>rooms;
    Scanner input;

    Library(){
        books = new ArrayList<>();
        issuedBooks= new ArrayList<>();
        members=new ArrayList<>();
        rooms=new ArrayList<>();
        input= new Scanner(System.in);

        rooms.add(new StudyRoom(101));
        rooms.add(new StudyRoom(102));
        rooms.add(new StudyRoom(103));
        rooms.add(new StudyRoom(104));


    }

    void addBook(Book book) {
        books.add(book);
        System.out.println("Book added.");
    }

    void removeBook(int id) {
        for (Book b : books) {
            if (b.getID() == id) {
                books.remove(b);
                System.out.println("Book Removed");
            }
            return;
        }
    }

    void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No Books Available");
            return;
        }
        for (Book b : books) {
            b.displayBook();
        }
    }

    void issueBook() {
    }

    void returnBook() {
    }

    Book searchBookByID(int id) {
        for (Book b : books) {
            if (b.getID() == id) {
                return b;
            }
        }
        return null;
    }

    void searchBookByAuthor() {
    }

    void displayIssuedBooks() {
        if (issuedBooks.isEmpty()) {
            System.out.println("No issued books");
            return;
        }
        for (IssuedBook ib : issuedBooks) {
            ib.displayIssuedBook();
        }
    }

    StudyRoom findRoom(int roomNumber)
    {
        for(StudyRoom r:rooms ){
            if(r.getRoomNumber()==roomNumber){
                return r;
            }
        }
        return null;
    }

    Member findMember(int memberID){
        for(Member m:members){
            if(m.getID()==memberID){
                return m;
            }
        } return null;
    }
    void reserveRoom(){
        System.out.println("Enter room number :");
        int roomNumber=input.nextInt();

        System.out.println("Enter member ID : ");
        int memberID=input.nextInt();

        StudyRoom room= findRoom(roomNumber);
        if(room==null){
            System.out.println("Room does not exist");
            return;
        }
        Member member= findMember(memberID);
        if(member==null){
            System.out.println("Member does not exist");
            return;
        }
        room.reserveRoom(memberID);



    }
    //Cancel Reservation
    void cancelReservation(){
        System.out.println("Enter room number :");
        int roomNumber=input.nextInt();

        System.out.println("Enter member ID : ");
        int memberID=input.nextInt();

        StudyRoom room= findRoom(roomNumber);
        if(room==null){
            System.out.println("Room does not exist");
            return;
        }
        Member member= findMember(memberID);
        if(member==null){
            System.out.println("Member does not exist");
            return;
        }
        if(room.getreservedByMemberID()!=memberID){
            System.out.println("The member didnt reserve this room.");
            return;
        }
        room.cancelReservation();

    }
    void displayRoomStatus(){
        System.out.println("----STUDY ROOMS----");
        for(StudyRoom r: rooms){
            r.displayRoomStatus();
        }
    }
}

