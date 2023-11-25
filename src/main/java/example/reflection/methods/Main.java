package example.reflection.methods;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Person person = new Person();
        Class<? extends Person> personClass = person.getClass();
        // get the setEmail method
        Method setEmailMethod = personClass.getMethod("setEmail", String.class);
        // get the getEmail method
        Method getEmailMethod = personClass.getMethod("getEmail");
        // invoke the setEmail method
        setEmailMethod.invoke(person, "nayan@appsmith.com");
        // invoke the getEmail method
        String email = (String) getEmailMethod.invoke(person);
        System.out.println(email);
    }
}
