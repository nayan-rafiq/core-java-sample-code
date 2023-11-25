package example.basics;

import java.util.ArrayList;

class MyClass {
    int myInt = 0;
    String myString = "Hello World!";
}

public class NonPrimitiveDataTypes {
    public static void main(String[] args) {
        // system defined non-primitive data types
        String myString = "Hello World!";
        ArrayList<String> arrayList = new ArrayList<>();

        // user defined non-primitive data types
        MyClass myClass = new MyClass();
    }
}
