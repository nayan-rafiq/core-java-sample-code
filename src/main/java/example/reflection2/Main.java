package example.reflection2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // list down the methods of Application object
        Class<?> myClass = Class.forName("example.reflection2.Application");
        Method[] methods = myClass.getMethods();
        for (Method method: methods) {
            System.out.println(method.getName());
        }

        // call the methods of Application object
        Constructor<?> constructor = myClass.getConstructor();
        Application application = (Application) constructor.newInstance();
        application.testMethod();
        application.anotherTestMethod();
        application.otherMethod();

        // get the Application2 object by annotation
        

        // list down the methods of the object by annotation
        // call the methods of the object by annotation
    }
}
