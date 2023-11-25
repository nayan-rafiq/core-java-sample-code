package example.reflection.examineclass;

public final class Person {
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    private void incrementAge() {
        this.age += 1;
    }
}
