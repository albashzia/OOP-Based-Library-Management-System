import java.util.ArrayList;
import java.util.Scanner;

public class Library
{
    Scanner input = new Scanner(System.in);
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<IssuedBook> issuedBooks = new ArrayList<>();
    ArrayList<Member> members = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
        System.out.println("Book added.");
    }

    void removeBook(int id) {
        for(Book b:books){
            if(b.getID()==id){
                books.remove(b);
                System.out.println("Book Removed");
            }
            return;
        }
    }

    void displayAllBooks() {
        if(books.isEmpty()){
            System.out.println("No Books Available");
            return;
        }
        for(Book b: books){
            b.displayBook();
        }
    }

    Member findMember(String memberId){
        for (Member m:members){
            if (m.getId()==memberId){
                return m;
            }
        }
        return null;
    }

    void issueBook() {
        System.out.print("Enter Book ID: ");
        int bookId = input.nextInt();
        System.out.print("Enter Member ID: ");
        String memberId = input.nextLine();
        input.nextLine();
        System.out.print("Enter Issue Date (DD/MM/YYYY): ");
        String date = input.nextLine();

        Book book = searchBookByID(bookId);
        if (book == null)
        {
            System.out.println("Book not found.");
            return;
        }

        Member member = findMember(memberId);
        if (member == null)
        {
            System.out.println("Member not found.");
            return;
        }

        if (book.getAvailableQuantity() == 0)
        {
            System.out.println("No copies available.");
            return;
        }

        book.issueCopy();
        issuedBooks.add(new IssuedBook(book, member, date));
        System.out.println("Book issued to " + member.getName());
    }

    void returnBook() {
    }

    Book searchBookByID(int id){
        for(Book b:books) {
            if (b.getID() == id) {
                return b;
            }
        }
        return null;
    }

    void searchBookByAuthor(){
    }

    void displayIssuedBooks(){
        if(issuedBooks.isEmpty()){
            System.out.println("No issued books");
            return;
        }
        for(IssuedBook ib:issuedBooks){
            ib.displayIssuedBook();
        }
    }

    public int findMemberIndexById(String id){
        //check if member already exists
        for(int i = 0; i < members.size(); i++){
            if (members.get(i).getId().equals(id)) {
                return i;
            }
        }
            return -1;
    }

    //REGISTER MEMBER
    public void registerNewMember(String id, String name,String phone, String email){
        if (findMemberIndexById(id) != -1) {
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
        int index = findMemberIndexById(id);

        if(index == -1){
            System.out.println("Member ID not found.");
            return;
        }

        members.remove(index);
        System.out.println("Member removed successfully");
    }

    //SEARCH MEMBER BY ID
    public void searchMemberById(String id){
        int index = findMemberIndexById(id);

        if(index == -1){
            System.out.println("Member not found");
            return;
        }

        System.out.println("Member found.");
        members.get(index).displayMemberDetails();
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
}
