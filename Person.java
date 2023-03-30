package OOP.catchTheKiller;

public class Person {
    private String name;
    private int age;
    private String occupation;

    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getOccupation() {
        return occupation;
    }

    public String toString() {
        return getName() + ", "+ getAge() + " years old, " + getOccupation();
    }
}
