package example.advanced;

import java.util.ArrayList;
import java.util.List;

class Human {
    private String name;
    public String getName() {
        return this.name;
    }

    public void setName(String x) {
        this.name = x;
    }
}

class Student extends Human {
    private int rollNo;
    public int getRollNo() {
        return this.rollNo;
    }
}

class HumanQueue<T extends Human> {
    private List<T> list = new ArrayList<>();

    public void push(T t) {
        this.list.add(t);
    }

    public T pop() {
        if (list.size() > 0) {
            return list.remove(0);
        } else {
            throw new RuntimeException("Stack is empty");
        }
    }
}

public class GenericClassExample2 {
    public static void main(String[] args) {
        Human person = new Human();
        person.setName("John");

        Student student = new Student();
        student.setName("Doe");

        HumanQueue<Human> integerQueue = new HumanQueue<>();
        integerQueue.push(person);
        integerQueue.push(student);
        System.out.println(integerQueue.pop().getName());
        System.out.println(integerQueue.pop().getName());
    }
}
