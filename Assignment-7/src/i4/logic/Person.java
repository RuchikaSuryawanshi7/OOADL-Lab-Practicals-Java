package i4.logic;

public abstract class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
    public void setName(String anothername){
        name = anothername;
    }
    public String getName(){
        return name;
    }
    public void Display(){
        System.out.println("Name: "+name);
    }
    public abstract void DiplayDetails();
    public boolean checkOtherPerson(Person person){
        return this.name.equalsIgnoreCase(person.name);
    }

}
