import java.util.*;
         //Secret no guessing
class Secret
{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int secret=26,attempts=1,n;
        while(true)
        {
            System.out.print("attempt "+attempts+"\nguess the no:");
            if(sc.nextInt()==secret)
            {
                break;
            }
            attempts++;
        }
        System.out.print("you took "+attempts+" attempts");
       
    }
}