package example.reflection.fetchbyannotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeMethodByAnnotation {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // list down the methods of Application object
        Class<?> myClass = Class.forName("example.reflection.fetchbyannotations.Application");
        Constructor<?> constructor = myClass.getConstructor();
        // create an instance of application using reflection
        Application application = (Application) constructor.newInstance();

        Method[] methods = myClass.getDeclaredMethods();
        for (Method method: methods) {
            if(method.isAnnotationPresent(MyAnnotation.class)) {
                method.invoke(application);
            }
        }
    }
}
