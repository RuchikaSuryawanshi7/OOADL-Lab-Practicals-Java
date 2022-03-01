package Assignments.OOP;

public class Test {
    public static void main(String[] args) {
        Parent p = new Parent("John", 50);
        Child c = new Child("Alex", 22);
        System.out.println(c.pname +" and "+ c.page);
        Child c2 = new Child("Bob",45,"shein",17);
        System.out.println(c2.pname +" and " +c2.page + " also for child "+ c2.cname +" and " + c2.cage);
        c2.Display();
    }
}
