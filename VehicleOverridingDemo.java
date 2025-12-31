/* Demonstration of method overriding and final methods in Java
 @JIYO P V     Roll No:33
 06 December 2025
*/
// Parent class
class Vehicle {

    // Normal method (can be overridden)
    void speed() {
        System.out.println("Vehicle speed is moderate");
    }

    // Final method (cannot be overridden)
    final void fuel() {
        System.out.println("Vehicle uses fuel");
    }
}

// Child class
class Car extends Vehicle {

    // Overriding method
    @Override
    void speed() {
        System.out.println("Car speed is fast");
    }

    //  This would cause compile-time error
    // void fuel() {
    //     System.out.println("Car uses petrol");
    // }
}

 class VehicleOverridingDemo {
    public static void main(String[] args) {
        Vehicle v = new Car();

        v.speed(); // Overridden method (Child version)
        v.fuel();  // Final method (Parent version)
    }
}
