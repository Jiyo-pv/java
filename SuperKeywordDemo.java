/*
    Demonstration of 'super' keyword in Java
    @JIYO P V     Roll No:33
    06 December 2025
*/

// Base (Parent) class
class Vehicle {

    int speed;

    // Parameterized constructor
    Vehicle(int speed) {
        this.speed = speed;
        System.out.println("Vehicle constructor called");
    }

    // Method to be overridden
    void display() {
        System.out.println("Vehicle speed: " + speed);
    }
}

// Derived (Child) class
class Car extends Vehicle {

    String model;

    // Child class constructor
    Car(int speed, String model) {

        // (b) Passing argument to base class constructor
        super(speed);

        this.model = model;
        System.out.println("Car constructor called");
    }

    // Overridden method
    @Override
    void display() {

        // (a) Using super to overcome function overriding
        super.display();

        System.out.println("Car model: " + model);
    }
}

// Main class
public class SuperKeywordDemo {
    public static void main(String[] args) {

        Car car = new Car(120, "Sedan");
        car.display();
    }
}
