// Defining an interface with some methods
interface Vehicle {
    void start();  // Abstract method
    void stop();   // Abstract method
}

// Base class Car
class Car {
    public void fuel() {
        System.out.println("Car is refueling");
    }
}

// Subclass ElectricCar that extends Car and implements Vehicle interface
class ElectricCar extends Car implements Vehicle {
    // Implementing methods from the Vehicle interface
    @Override
    public void start() {
        System.out.println("ElectricCar is starting silently.");
    }

    @Override
    public void stop() {
        System.out.println("ElectricCar is stopping.");
    }

    @Override
    public void fuel() {
        System.out.println("Car is NOT refueling");
    }
    // Adding its own method
    public void charge() {
        System.out.println("ElectricCar is charging.");
    }
}

// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        ElectricCar myCar = new ElectricCar();
        myCar.start();   // Implemented from Vehicle interface
        myCar.fuel();    // Inherited from Car class
        myCar.charge();  // Specific to ElectricCar
        myCar.stop();    // Implemented from Vehicle interface
    }
}
