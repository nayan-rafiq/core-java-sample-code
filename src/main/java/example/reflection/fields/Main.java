package example.reflection.fields;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Person person = new Person();
        person.email = "nayan@appsmith.com";
        person.isAdult = true;
        person.age = 100;

        Class<?> personClass = person.getClass();
        Field[] fields = personClass.getFields();

        System.out.println("fields length: " + fields.length); // will be 1

        for (Field field : fields) { // only public fields are returned
            System.out.println("field name: " + field.getName()); // email
            System.out.println("data type: " + field.getType()); // data type, e.g. class java.lang.String

            Object value = field.get(person); // get the value of the field
            if(field.getType() == Boolean.class) {
                System.out.println("boolean value: " + value); // get the value of the field
            }

            if(field.getType() == Integer.class) {
                System.out.println("int value: " + value); // get the value of the field
            }

            if(field.getType() == String.class) {
                System.out.println("string value: " + value); // get the value of the field
            }
        }
    }
}
