/* 
    Demonstration of runtime polymorphism in Java using interfaces
    @JIYO P V     Roll No:33
    31 December 2025
*/
// Interface
interface Vehicle {
    void move();
}

// First implementation
class Car implements Vehicle {
    public void move() {
        System.out.println("Car is moving on the road");
    }
}

// Second implementation
class Bike implements Vehicle {
    public void move() {
        System.out.println("Bike is moving on two wheels");
    }
}

// Main class
public class RuntimePolymorphismDemo {
    public static void main(String[] args) {

        Vehicle v;   // interface reference

        v = new Car();
        v.move();    // calls Car's move()

        v = new Bike();
        v.move();    // calls Bike's move()
    }
}
