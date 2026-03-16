public class IssuedBook {

    //ATTRIBUTES

    private Book book; // associated with Book object
    private Member member; //associated with Member object
    private String issueDate;

    //Parameterized Constructor
    IssuedBook(Book book, Member member, String date) {
        this.book = book;
        this.member = member;
        this.issueDate = date;
    }

    void displayIssuedBook(){
        System.out.println("Issued Book Details:");
        book.displayBook();

        System.out.println("Issued To:");
        member.displayMemberDetails();

        System.out.println("Issue Date: " + issueDate);
        System.out.println("--------------------------");
    };

    Book getBook(){
        return book;
    };

    Member getMember(){
        return member;
    };

    String getIssueDate(){
        return issueDate;
    };
}
