package example.basics;

public class LogicalOperators {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        System.out.println("x == y: " + (x == y));
        System.out.println("y > x: " + (y > x));
        System.out.println("x * 2 >= y: " + (x * 2 >= y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x * 2 <= y: " + (x * 2 <= y));

        if(x > y) {
            System.out.println("x is greater than y");
        } else if(x < y) {
            System.out.println("x is less than y");
        } else {
            System.out.println("x is equal to y");
        }
    }
}
