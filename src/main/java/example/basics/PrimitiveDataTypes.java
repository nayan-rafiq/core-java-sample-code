package example.basics;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // data types for full numbers
        byte byteVar = 12; // 8 bit, maximum is 127
        short shortVar = 123; // 16 bits, maximum is 2^15 - 1, -32768 to 32767
        int intVar = 123; // 32 bits, maximum is 2^31 - 1, -2147483648 to 2147483647
        long longVar = 123L; // 64 bits, maximum is 2^63 - 1, -9223372036854775808 to 9223372036854775807

        // for storing characters
        char charVar = 'a'; // single quotes, two bytes

        // for storing decimal numbers
        float floatVar = 0.0f; // 32 bits
        double doubleVar = 0.0; // 64 bits

        // storing true or false
        boolean booleanVar = false; // either true or false
    }
}
