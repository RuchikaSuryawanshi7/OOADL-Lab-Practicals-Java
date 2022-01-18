package i4;

public abstract class Person {
    private String name;
    public Person() {
        name = "no name";
    }
    public Person(String myName) {
        super();
        this.name = myName;
    }
    public void setName(String anotherName) {
        this.name = anotherName;
    }
    public String getName() {
        return name;
    }
    public void displayName() {
        System.out.println(getName());
    }
    public abstract void displayDetails();
    public boolean hasSameName(Person other) {
        return this.name.equalsIgnoreCase(other.name);
    }
}