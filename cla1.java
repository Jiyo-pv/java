// Program to add two integers using command-line arguments in Java
// @JIYO P V    Roll no:33
// 17 November 2025

class cla1 {
    public static void main(String args[]) {

        // Convert the first command-line argument from String to int
        int a = Integer.parseInt(args[0]);

        // Convert the second command-line argument from String to int
        int b = Integer.parseInt(args[1]);

        // Display the addition in the format: a+b=result
        System.out.print(a + "+" + b + "=" + (a + b));
    }
}
