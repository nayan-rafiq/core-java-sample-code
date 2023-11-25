package example.advanced;

class A {
    private int age; // private can only be accessed by the class itself
    protected String name; // protected is like private but can be accessed by child classes
    public String city; // public can be accessed by anyone

    public void printNameAndAge() {
        System.out.println("Inside A: Name: " + this.name + ", Age: " + this.age + ", City: " + this.city);
    }

    public void setAge(int x) {
        this.age = x;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class B extends A {
    private String division;

    public void setDivision(String division) {
        this.division = division;
    }

    public void printNameAndAge() {
        // System.out.println("Inside B: Name: " + this.name + ", Age: " + this.age + ", City: " + this.city);
        System.out.println("Inside B: Name: " + this.name + ", Age: " + this.getAge() + ", City: " + this.city + ", Division: " + this.division);
    }
}

public class Inheritance {

    public static void main(String[] args) {
        A a = new A();
        a.setAge(10);
        a.setName("John");
        a.city = "Dhaka";
        a.printNameAndAge();

        B b = new B();
        b.setAge(12);
        b.setName("Doe");
        b.city = "Jessore";
        b.setDivision("Khulna");
        b.printNameAndAge();

        A a1 = new B();
        a1.setAge(15);
        a1.setName("Doe");
        a1.city = "Jessore";
        // a1.setDivision("Khulna");
        a1.printNameAndAge(); // Polymorphism
    }
}
