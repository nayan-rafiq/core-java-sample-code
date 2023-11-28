package example.reflection.fetchbyannotations;


public class Application {
    @MyAnnotation
    public void testMethod() {
        System.out.println("test method called");
    }

    public void anotherTestMethod() {
        System.out.println("anotherTestMethod method called");
    }

    @MyAnnotation
    public void otherMethod() {
        System.out.println("otherMethod method called");
    }
}
