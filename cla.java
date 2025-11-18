// Program to concatenate two strings using command-line arguments in Java
// @JIYO P V    Roll no:33
// 17 November 2025

class cla {
    public static void main(String args[]) {
        if(args.length==0)
        {
            System.out.println("arguments not present.\n usage: cla arg1 arg2 ");
            return;
        }
        // Retrieve the first command-line argument as a string
        String a = args[0];
        // Retrieve the second command-line argument as a string
        String b = args[1];
        // display  arguments
        System.out.print("a="+a +"  b="+b);
    }
}
