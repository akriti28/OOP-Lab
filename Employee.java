import java.util.*;
public class Employee
{
    String name,city;
    Double basic,da,hra;
    void getdata()
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter Employee name,city,basic salary, dearness allowance(%)\nand house rent");
        name=scr.nextLine();
        city=scr.next();
        basic=scr.nextDouble();
        da=scr.nextDouble();
        hra=scr.nextDouble();
    }
    double calculate()
    {
        double total=basic+basic*da/100+basic*hra/100;
        return total;
    }
    void display()
    {
        System.out.println("Total salary= "+calculate());
    }
    public static void main(String args[])
    {
        Employee obj=new Employee();
        obj.getdata();
        obj.display();
    }
}
