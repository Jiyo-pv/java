//Display from n - 1 and 1-n using recursive functions.
class NRecursive
{
    void nto1(n)
    {
        if(n==1)
        {
            System.out.println(1);
        }
        else{
            System.out.println(n);
            nto1(n-1);
        }
    }
   
    public static  void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n:");
        int n=sc.nextInt();

    }
}