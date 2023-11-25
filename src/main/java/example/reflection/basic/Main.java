package example.reflection.basic;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<String> getFieldNames(Field[] fields) {
        List<String> fieldNames = new ArrayList<>();
        for (Field field : fields)
            fieldNames.add(field.getName());
        return fieldNames;
    }

    private static List<String> getMethodNames(Method[] methods) {
        List<String> methodNames = new ArrayList<>();
        for (Method method : methods)
            methodNames.add(method.getName());
        return methodNames;
    }

    public static void main(String[] args) {
        Object person = new Person();
        // get the fields of person
        Field[] fields = person.getClass().getDeclaredFields();

        // get the methods of person
        Method[] methods = person.getClass().getDeclaredMethods();

        List<String> fieldNames = getFieldNames(fields);
        List<String> methodsNames = getMethodNames(methods);

        System.out.println(fieldNames);
        System.out.println(methodsNames);
    }
}
