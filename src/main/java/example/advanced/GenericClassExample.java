package example.advanced;

import java.util.ArrayList;
import java.util.List;

class Queue<T> {
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

public class GenericClassExample {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new Queue<Integer>();
        integerQueue.push(10);
        integerQueue.push(20);
        System.out.println(integerQueue.pop());
        System.out.println(integerQueue.pop());

        Queue<String> stringQueue = new Queue<String>();
        stringQueue.push("Hello");
        stringQueue.push("World");
        System.out.println(stringQueue.pop());
        System.out.println(stringQueue.pop());
    }
}
