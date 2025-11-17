// Program to demonstrate arithmetic operations using command-line arguments in Java
// @JIYO P V    Roll no:33
// 17 November 2025

class cla2 {
    public static void main(String args[]) {

        int res = 0; // variable to store result

        // Check if exactly 3 arguments are passed
        if (args.length != 3) {
            System.out.println("error: need 3 arguments \ncla2 a b <opcode>");
            System.out.println("op codes:0-add 1-diff 2-multiply 3-divide");
            return;
        }

        // Convert first two arguments to integers
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        // Switch based on opcode (third argument)
        switch (args[2]) {

            case "0":
                System.out.println("addition");
                res = a + b; // perform addition
                break;

            case "1":
                System.out.println("Subtraction");
                res = a - b; // perform subtraction
                break;

            case "2":
                System.out.println("product");
                res = a * b; // perform multiplication
                break;

            case "3":
                System.out.println("division");

                // Check division by zero
                if (b == 0) {
                    System.out.println("division by zero not possible");
                    return;
                }
                res = a / b; // perform division
                break;

            default:
                // Invalid opcode
                System.out.println("error: opcodes are 0 1 2 3");
                return;
        }

        // Print final result
        System.out.println(res);
    }
}
