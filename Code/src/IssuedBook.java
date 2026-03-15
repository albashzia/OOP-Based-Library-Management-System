public class IssuedBook {
    Book book;
    Member member;
    String issueDate;

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

    void getBook(){
        book.displayBook();
    };

    void getMember(){
        member.displayMemberDetails();
    };

    String getIssueDate(){
        return issueDate;
    };
}
