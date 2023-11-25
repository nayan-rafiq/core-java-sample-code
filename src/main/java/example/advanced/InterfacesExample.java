package example.advanced;

interface Driver {
    void getDrivingLicense();
}

interface Singer {
    void sing();
}

class Person implements Driver, Singer {
    @Override
    public void getDrivingLicense() {
        System.out.println("Person got driving license");
    }

    @Override
    public void sing() {
        System.out.println("Person is singing");
    }
}

public class InterfacesExample {
    public static void main(String[] args) {
        Person person = new Person();
        person.getDrivingLicense();
        person.sing();

        Driver driver = new Person();
        driver.getDrivingLicense();

        Singer singer = new Person();
        singer.sing();

        helloSinger(person);
        helloDriver(person);
    }

    private static void helloSinger(Singer singer) {
        singer.sing();
    }

    private static void helloDriver(Driver driver) {
        driver.getDrivingLicense();
    }
}
