package Assignments.OOP;

public class Child extends Parent {
    String cname;
    int cage;
    public Child(String name, int age){
        super();
        this.cname = name;
        this.cage = age;
    }
    public Child(String pname, int page, String cname, int cage){
        super(pname,page);
        this.cname = cname;
        this.page = page;
        this.cage = cage;

    }
}
