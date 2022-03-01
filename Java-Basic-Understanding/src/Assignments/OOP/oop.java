package Assignments.OOP;

public class oop {
    int HumanId;
    String Humanname;
    int Age;
    static int count;
    public oop(int id, String name, int age){
        this.HumanId = id;
        this.Humanname = name;
        this.Age = age;
        oop.count += 1;
    }
    public void Data(){
        System.out.println(this.Humanname +" ID is "+ HumanId+ " and Age as: "+ Age +" "+ count);
    }


    public static void main(String[] args) {
        oop obj = new oop(1,"Ruchi",19);
        oop obj1 = new oop(2,"Ruchika",19);
        oop obj3 = new oop(3,"Rucha",19);
        obj.Data();
        obj1.Data();
        obj3.Data();
        System.out.println(oop.count);
    }
}
