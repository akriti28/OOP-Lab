import java.util.*;
public class complex
{
    double real,img;
    complex add(int a, complex b)
    {
        complex c=new complex();
        c.real=a+b.real;
        c.img=b.img;
        return c;
    }
    complex add(complex a, complex b)
    {
        complex c=new complex();
        c.real=a.real+b.real;
        c.img=a.img+b.img;
        return c;
    }        
    public static void main(String args[])
    {
        Scanner scr=new Scanner(System.in);
        complex first=new complex();
        complex second=new complex();
        complex third=new complex();
        System.out.println("Enter the real and imaginary part of first complex");
        first.real=scr.nextDouble();
        first.img=scr.nextDouble();
        System.out.println("Enter the real and imaginary part of second complex");
        second.real=scr.nextDouble();
        second.img=scr.nextDouble();
        third=third.add(second,first);
        System.out.println("sol="+third.real+"+"+third.img+"y");
        System.out.println("enter an integer you wish to add");
        int integer=scr.nextInt();
        third=third.add(integer,third);
        System.out.println("sol="+third.real+"+"+third.img+"y");
    }
}
