import java.util.*;
class StudentInfo
{
    int sno;
    String sname,sprogram;
    public void read()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter  student no:");
        sno=sc.nextInt();
        System.out.print("enter  student name:");
        sname=sc.next();
        System.out.print("enter  program:");
        sprogram=sc.next();
    }
    public void disp()
    {
        System.out.println("\nsno:"+sno);
        System.out.println("name:"+sname);
        System.out.println("program:"+sprogram);
    }
    public void compare(StudentInfo s)
    {
        if(s.sno!=sno || !s.sname.equals(sname) || !s.sprogram.equals(sprogram))
        {
            System.out.print("both are different data ");
            return;
        } 
        System.out.print("both are identical data ");
           

    }
}
class Student
{
    public static  void main(String args[])
    {
        StudentInfo s1,s2;
        s1=new StudentInfo();
        s2=new StudentInfo();
        s1.read();
        s2.read();
        s1.disp();
        s2.disp();
        s1.compare(s2);
    }
}