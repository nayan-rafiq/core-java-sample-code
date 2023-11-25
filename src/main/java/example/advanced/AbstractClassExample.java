package example.advanced;

abstract class Vehicle {
    abstract void start();
    abstract void stop();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car started");
    }
    void stop() {
        System.out.println("Car stopped");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike started");
    }
    void stop() {
        System.out.println("Bike stopped");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        // Vehicle vehicle = new Vehicle(); // error: Vehicle is abstract; cannot be instantiated

        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start();
        car.stop();

        bike.start();
        bike.stop();
    }
}
