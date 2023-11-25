package example.annotations.example1;

public class Hello {
    @MyAnnotation(value=10)
    public void sayHello() {
        System.out.println("hello annotation");
    }
}
