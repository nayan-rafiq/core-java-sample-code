package example.basics;

public class Person {
    private int age;
    public String name;

    public Person() {
        // doing nothing
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int x) {
        this.age = x;
    }

    public void printNameAndAge() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
}
