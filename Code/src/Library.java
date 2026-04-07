import java.util.Scanner;
import java.util.ArrayList;

public class Library {

    //instantiating the operational objects such as ArrayLists and Scanner object
    ArrayList<Book> books;
    ArrayList<IssuedBook> issuedBooks ;
    ArrayList<Member>members;
    ArrayList<StudyRoom>rooms;
    Scanner input;

    //Default constructor to initialize the objects
    public Library(){
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

    /*
     * ----BOOK OPERATIONS----*/

    //method to add books to the array list
    public void addBook(Book book)
    {
        books.add(book);
        System.out.println("Book added.");
    }

    //method to remove books from the array list
    public void removeBook(int id)
    {
        for (int i = 0; i < books.size(); i++)
        {
            if (books.get(i).getID() == id)
            {
                books.remove(i);
                System.out.println("Book removed");
                return;
            }
        }
        System.out.println("Book not found");
    }

    //method to display all books using a for-each loop and method defined in Book class
    public void displayAllBooks()
    {
        if (books.isEmpty())
        {
            System.out.println("No Books Available");
            return;
        }
        for (Book b : books)
        {
            b.displayBook();
        }
    }

    //method to issue a Book
    public void issueBook()
    {
        System.out.print("Enter Book ID: ");
        int id = input.nextInt();
        input.nextLine();

        Book b = searchBookByID(id);
        if(b == null)
        {
            System.out.println("Book not found");
            return;
        }

        System.out.print("Enter Member ID: ");
        String mId = input.nextLine();

        Member m = findMemberById(mId);
        if(m == null)
        {
            System.out.println("Member not found");
            return;
        }

        if(b.getAvailableQuantity() > 0)
        {
            b.issueCopy();
            System.out.println("Enter the date: ");
            String date = input.nextLine();
            issuedBooks.add(new IssuedBook(b, m, date));
        }
        else
        {
            System.out.println("No copies available");
        }
    }

    //method to record a returned book
    public void returnBook()
    {
        System.out.print("Enter Book ID: ");
        int bookId = input.nextInt();
        input.nextLine();

        System.out.print("Enter Member ID: ");
        String memberId = input.nextLine();

        IssuedBook found = null;

        for (IssuedBook ib : issuedBooks)
        {
            if (ib.getBook().getID() == bookId &&
                    ib.getMember().getId().equals(memberId))
            {
                found = ib;
                break;
            }
        }

        if (found != null) {
            // increase book quantity
            found.getBook().returnCopy();

            // remove issued record
            issuedBooks.remove(found);

            System.out.println("Book returned successfully.");
        }
        else
        {
            System.out.println("No matching issued record found.");
        }
    }

    //method to search a Book and return a Book object using its ID
    public Book searchBookByID(int id)
    {
        for (Book b : books)
        {
            if (b.getID() == id)
            {
                return b;
            }
        }
        return null;
    }

    //method to search a Book and display book first taking the author name from the user
    public void searchBookByAuthor()
    {
        System.out.print("Enter author name: ");
        String author = input.nextLine();

        boolean found = false;

        for (Book b : books)
        {
            if (b.getAuthor().equalsIgnoreCase(author))
            {
                b.displayBook();
                found = true;
            }
        }
        if (!found)
        {
            System.out.println("No books found by this author.");
        }
    }

    //method to display all the issued books
    public void displayIssuedBooks()
    {
        if (issuedBooks.isEmpty())
        {
            System.out.println("No issued books");
            return;
        }
        for (IssuedBook ib : issuedBooks)
        {
            ib.displayIssuedBook();
        }
    }

    public StudyRoom findRoom(int roomNumber)
    {
        for(StudyRoom r:rooms ){
            if(r.getRoomNumber()==roomNumber){
                return r;
            }
        }
        return null;
    }

    /*
     * ----MEMBERSHIP OPERATIONS----*/

    public Member findMemberById(String id){
        for(Member m : members){
            if(m.getId().equals(id)){
                return m;
            }
        }
        return null;
    }

    //REGISTER MEMBER
    public void registerNewMember(String id, String name,String phone, String email){
        if (findMemberById(id) != null) {
            System.out.println("Member ID already exists.");
            return;

        }

        //adds a new member
        members.add(new Member(id,name,phone,email));
        System.out.println("Member registered successfully");
    }

    //REMOVE MEMBER
    public void removeMember(String id){
        //checks if member id already exists or not
        Member m = findMemberById(id);

        if(m == null){
            System.out.println("Member ID not found.");
            return;
        }

        members.remove(m);
        System.out.println("Member removed successfully");
    }

    //SEARCH MEMBER BY ID
    public void searchMemberById(String id){
        Member m = findMemberById(id);

        if(m == null){
            System.out.println("Member not found");
            return;
        }

        System.out.println("Member found.");
        m.displayMemberDetails();
    }

    //SEARCH MEMBERS BY NAME
    public void searchMemberByName(String name) {

        boolean found = false;

        //using for loop
        for (Member m : members) {
            if (m.getName().equalsIgnoreCase(name)) {
                System.out.println("Member Found:");
                m.displayMemberDetails();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Member not found");
        }
    }

    //DISPLAY ALL MEMBERS
    public void displayAllMembers(){
        if(members.isEmpty()){
            System.out.println("No members registered");
            return;
        }

        System.out.println("---ALL MEMBERS---");
        for(Member m : members){
            System.out.println("ID : " +m.getId()+ " | Name : " +m.getName());
        }
    }

    //VIEW BOOKS ISSUED BY A MEMBER
    public void viewBooksIssuedByAMember(){
        System.out.println("Enter member ID : ");
        String mId = input.nextLine();

        Member m = findMemberById(mId);

        if(m == null){
            System.out.println("Member not found.");
            return;
        }

        System.out.println("\nBooks issued to:");


        //now check if the member has issued books
        boolean flag = false;

        for(IssuedBook ib : issuedBooks){
            if(ib.getMember().getId().equals(mId)){
                ib.displayIssuedBook();
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("No books issued to this member.");
        }
    }

    /*
     * ----STUDY ROOM OPERATIONS----*/

    void reserveRoom(int roomNumber,String memberID){


        StudyRoom room= findRoom(roomNumber);
        if(room==null){
            System.out.println("Room does not exist");
            return;
        }
        Member member= findMemberById(memberID);
        if(member==null){
            System.out.println("Member does not exist");
            return;
        }
        room.reserveRoom(memberID);



    }
    //Cancel Reservation
    void cancelReservation(int roomNum,String memID){


        StudyRoom room= findRoom(roomNum);
        if(room==null){
            System.out.println("Room does not exist");
            return;
        }
        Member member= findMemberById(memID);
        if(member==null){
            System.out.println("Member does not exist");
            return;
        }
        if(room.getReservedByMemberID()==null || !room.getReservedByMemberID().equals(memID)){
            System.out.println("The member didnt reserve this room.");
            return;
        }
        room.cancelReservation();

    }


    void displayRoomStatus(){
        System.out.println("----------STUDY ROOMS----------");
        System.out.println("-------------------------------");
        System.out.println("Room No    Status     Member ID");
        for(StudyRoom r: rooms){
            r.displayRoomStatus();
        }
    }
}

