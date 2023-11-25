package example.reflection.examineclass;

import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
        Class<Person> personClass = Person.class;

        personClass.isInterface();
        personClass.getConstructors(); // get the constructors of personClass
        personClass.getFields(); // get the public fields of personClass
        personClass.getMethods(); // get the public methods of personClass
        personClass.isArray();
        personClass.isEnum();
        personClass.isPrimitive();
        personClass.isAnnotation();
    }
}
