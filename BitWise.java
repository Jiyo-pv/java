import java.util.Scanner;

public class BitWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter shift value: ");
        int s = sc.nextInt();

        // Bitwise logical operators
        System.out.println("a & b = " + (a & b)); // AND
        System.out.println("a | b = " + (a | b)); // OR
        System.out.println("a ^ b = " + (a ^ b)); // XOR
        System.out.println("~a = " + (~a));       // NOT

        // Shift operators using shift value
        System.out.println("a << s = " + (a << s));   // Left shift
        System.out.println("a >> s = " + (a >> s));   // Right shift
        System.out.println("a >>> s = " + (a >>> s)); // Unsigned right shift
    }
}
