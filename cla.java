// Program to display sum of two numbers using command line arguments
// @JIYO P V    Roll no:33
// 17 November 2025

class cla {
    public static void main(String args[]) {
        if(args.length<2)
        {
            System.out.println("arguments not present.\n usage: cla arg1 arg2 ");
            return;
        }
        // Retrieve the first command-line argument as a string
        int a = Integer.parseInt(args[0]);
        // Retrieve the second command-line argument as a string
        int b = Integer.parseInt(args[1]);
        // display  arguments
        System.out.println("a="+a +"  b="+b);
        System.out.println("sum="+(a+b));
    }
}
