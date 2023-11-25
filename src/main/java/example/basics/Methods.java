package example.basics;

import java.time.Instant;
import java.util.Date;

public class Methods {

    int add(int x, int y) {
        return x + y;
    }

    void print(String s) {
        System.out.println(s);
    }

    void printCurrentDate() {
        System.out.println(Date.from(Instant.now()));
    }
}
