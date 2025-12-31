/*
    Demonstration of Employee class with methods to read, display, and compare employee details
    @JIYO P V     Roll No:33
    06 December 2025
*/
import java.util.Scanner;

// Employee class
class Employee {
    int eno;
    String ename;
    double esal;

    // Function to read employee details
    void read(Scanner sc) {
        System.out.print("Enter Employee Number: ");
        eno = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Employee Name: ");
        ename = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        esal = sc.nextDouble();
    }

    // Function to display employee details
    void display() {
        System.out.println(eno + "\t" + ename + "\t" + esal);
    }

    // Function to compare employee number
    boolean compareEno(int number) {
        return eno == number;
    }
}

// Main class
public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] emp = new Employee[n];

        // Reading employee details
        for (int i = 0; i < n; i++) {
            emp[i] = new Employee();
            System.out.println("\nEnter details of Employee " + (i + 1));
            emp[i].read(sc);
        }

        // Displaying employee details
        System.out.println("\nEmployee Details:");
        System.out.println("ENO\tENAME\tESAL");
        for (int i = 0; i < n; i++) {
            emp[i].display();
        }

        // Searching for employee by eno
        System.out.print("\nEnter employee number to search: ");
        int searchEno = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (emp[i].compareEno(searchEno)) {
                System.out.println("\nEmployee Found:");
                System.out.println("ENO\tENAME\tESAL");
                emp[i].display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nEmployee not found.");
        }

       
    }
}
