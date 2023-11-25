package example.basics;

public class Loops {
    public static void main(String[] args) {
        int i;
        System.out.println("for loop");
        for(i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("while loop");
        i = 0;
        while(i < 5) {
            System.out.println("i = " + i);
            i++;
        }

        System.out.println("do while loop");
        i = 0;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 5);

        System.out.println("do while loop with false condition");
        i = 5;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 5);
    }
}
