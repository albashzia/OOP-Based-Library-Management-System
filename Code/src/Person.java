    public class Person {
    //data members
    private String id;
    private String name;

    //default constructor
    public Person(){
        id = "null";
        name = "none";
    }

    //parameterized constructor
    public Person(String i, String n){
        id = i;
        name = n;
    }

    //setters
    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    //getters
    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    //display method
    public void displayDetails(){
        System.out.println("ID: " +this.id);
        System.out.println("Name: " +this.name);
    }
}
