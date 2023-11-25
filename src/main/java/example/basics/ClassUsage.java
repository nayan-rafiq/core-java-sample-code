package example.basics;

public class ClassUsage {
    public static void main(String[] args) {
        // constructing a Person object using different constructor
        Person person1 = new Person();
        person1.setAge(10);
        System.out.println("person1 age: " + person1.getAge());

        Person person2 = new Person(10);
        System.out.println("person2 age: " + person2.getAge());

        Person person3 = new Person(10, "John");
        System.out.println("person3 age: " + person3.getAge());
        System.out.println("person3 name: " + person3.name);
    }
}
