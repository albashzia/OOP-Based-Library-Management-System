public class IssuedBook {

    //Data members
    private Book book; // associated with Book object
    private Member member; //associated with Member object
    private String issueDate;

    //Default Constructor
    public IssuedBook(){
        this.book = new Book();
        this.member = new Member();
        this.issueDate = "not specified";
    }

    //Parameterized Constructor
    public IssuedBook(Book book, Member member, String date)
    {
        this.book = book;
        this.member = member;
        this.issueDate = date;
    }

    //Method to display the details of the issued book
    public void displayIssuedBook()
    {
        System.out.println("Issued Book Details:");
        book.displayBook();

        System.out.println("Issued To:");
        member.displayMemberDetails();

        System.out.println("Issue Date: " + issueDate);
        System.out.println("--------------------------");
    }

    //Getter methods
    public Book getBook()
    {
        return book;
    }

    public Member getMember()
    {
        return member;
    }

    public String getIssueDate()
    {
        return issueDate;
    }
}
