import java.util.Scanner;

//A function takes an integer argument and returns the reverse of the same. Another
//function takes an integer argument and returns true or false if the number is a
//palindrome, using the above function.
//@JIYO P V    03-12-2025

public class ReversePal {

    // Function to reverse an integer
    public static int reverse(int n) {
        int reversed = 0;
        int temp = n;
        // Handle negative numbers if necessary, though palindrome usually implies positive for this context
        // but let's stick to simple digit reversal.
        // If n is negative, the loop works but the sign might be tricky depending on requirements.
        // Usually palindrome checks are done on the absolute value or positive integers.
        // Let's assume standard behavior: -121 reversed is -121 (mathematically) or we treat it as string.
        // But for integer reversal:
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int n) {
        // A negative number is generally not considered a palindrome (e.g. -121 reads 121- backwards)
        // However, if we just compare n == reverse(n), -121 == -121.
        // Let's stick to the strict definition: n must equal its reverse.
        return n == reverse(n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (isPalindrome(number)) {
                System.out.println(number + " is a palindrome.");
            } else {
                System.out.println(number + " is not a palindrome.");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }
        scanner.close();
    }
}
