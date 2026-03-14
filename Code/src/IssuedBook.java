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
