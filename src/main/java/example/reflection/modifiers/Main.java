package example.reflection.modifiers;

import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
        Class<Person> personClass = Person.class;
        int modifiers = personClass.getModifiers();

        System.out.println("is abstract: " + Modifier.isAbstract(modifiers));
        System.out.println("is final: " + Modifier.isFinal(modifiers));
        System.out.println("is interface: " + Modifier.isInterface(modifiers));
        System.out.println("is native: " + Modifier.isNative(modifiers));
        System.out.println("is private: " + Modifier.isPrivate(modifiers));
        System.out.println("is protected: " + Modifier.isProtected(modifiers));
        System.out.println("is public: " + Modifier.isPublic(modifiers));
        System.out.println("is static: " + Modifier.isStatic(modifiers));
    }
}
