package Assignments.OOP;

public class Parent {
    public String pname;
    public int page;
    public Parent(String name, int age){
       this.pname = name;
       this.page = age;
    }

    public Parent() {
        this.pname ="hidh";
        this.page =54;
    }

    public void Display(){
        System.out.println("helllo "+ this.pname+ " your age is "+ this.page );
    }
}
