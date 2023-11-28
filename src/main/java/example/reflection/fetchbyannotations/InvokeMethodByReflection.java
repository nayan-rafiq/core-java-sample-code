package example.reflection.fetchbyannotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeMethodByReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // list down the methods of Application object
        Class<?> myClass = Class.forName("example.reflection.fetchbyannotations.Application");
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

        // call the methods that has a annotation
        Class<?> applicationClass = Application.class;
        Method[] applicationClassMethods = applicationClass.getMethods();
        for (Method method: methods) {

            System.out.println(method.getName());
        }
    }
}
