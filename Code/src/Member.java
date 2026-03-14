public class Member extends Person {
    //data members
    private String phone;
    private String email;

    //default constructor
    public Member(){
        this.phone = "xxxxxxxxxxx";
        this.email = "----@gmail.com";
    }

    //parameterized constructor
    public Member(String id, String name, String phoneNumber, String mail){
        super(id,name);
        this.phone = phoneNumber;
        this.email = mail;
    }

    //setters
    public void setPhone(String phone){
        this.phone = phone;
    }

    public void setEmail(String email){
        this.email = email;
    }

    //getters
    public String getPhone(){
        return phone;
    }

    public String getEmail(){
        return email;
    }

    //display  method
    public void displayMemberDetails(){
        super.displayDetails();
        System.out.println("Phone Number: " +this.phone);
        System.out.println("Email: " +this.email);
    }

}
