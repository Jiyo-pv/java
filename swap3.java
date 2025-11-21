import java.util.Scanner;

public class SwapXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        // Swapping using XOR operator (no third variable)
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping : a = " + a + ", b = " + b);
    }
}
