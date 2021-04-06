import java.util.*;
class student
{
    int reg_no,age;
    String name;
    student(int r,int a,String n)
    {
        reg_no=r;
        age=a;
        name=n;
    }
    void display()
    {
        System.out.println("the registration number is "+reg_no);
        System.out.println("the name is "+name);
        System.out.println("the age is "+age);
    }
}

class ug extends student
{
    int sem,fee;
    ug(int r,int a,String n,int s,int f)
    {
        super(r,a,n);
        sem=s;
        fee=f;
    }
    void disp()
    {
        display();
        System.out.println("semester:\t"+sem);
        System.out.println("fee:\t"+fee);
    }
}

class pg extends student
{
    int sem,fee;
    pg(int r,int a,String n,int s,int f)
    {
        super(r,a,n);
        sem=s;
        fee=f;
    }
    void disp()
    {
        display();
        System.out.println("semester:\t"+sem);
        System.out.println("fee:\t"+fee);
    }
}

class college
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input registration number");
        int r=sc.nextInt();
        System.out.println("input age");
        int a=sc.nextInt();
        sc.nextLine();
        System.out.println("input name");
        String n=sc.nextLine();
        
        System.out.println("1---undergraduate\n2---post graduate");
        int c=sc.nextInt();
        if(c==1)
        {
            System.out.println("input semester and fees");
            int s=sc.nextInt();
            int f=sc.nextInt();
            ug ob=new ug(r,a,n,s,f);
            ob.disp();
            
        }
        else
            {
            System.out.println("input semester and fees");
            int s=sc.nextInt();
            int f=sc.nextInt();
            pg ob=new pg(r,a,n,s,f);
            ob.disp();
            
        }
    }
}