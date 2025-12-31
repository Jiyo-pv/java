/*
    Demonstration of ISA and HASA relationships in Java
    @JIYO P V     Roll No:33
    06 December 2025
*/

// HASA relationship
class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

// Parent class (ISA)
class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

// Child class (ISA + HASA)
class Car extends Vehicle {
    private Engine engine;

    Car() {
        engine = new Engine();
    }

    void startCar() {
        engine.start(); // HASA
        move();         // ISA
        System.out.println("Car is running");
    }
}

// MAIN class (vehicle-related name)
public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.startCar();
    }
}
