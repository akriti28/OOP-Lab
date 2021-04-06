import java.util.*;
abstract class bank
{
    int rate;
    abstract int getRateOfInterest();
}

class SBI extends bank
{
    int getRateOfInterest()
    {
        return 8;
    }
    
}

class ICICI extends bank
{
    int getRateOfInterest()
    {
        
        return 7;
    }
    
}

class AXIS extends bank
{
    int getRateOfInterest()
    {
        return 9;
    }
    
}

class calc
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("input the bank \n 1---SBI\n 2---ICICI\n 3---AXIS");
        int b=sc.nextInt();
        int r=0;
        switch(b)
        {
            case 1:
                    SBI ob1=new SBI ();
                    r=ob1.getRateOfInterest();
                    break;       
            case 2:
                    ICICI ob2=new ICICI ();
                    r=ob2.getRateOfInterest();
                    break;
            case 3:
                    AXIS ob3=new AXIS ();
                    r=ob3.getRateOfInterest();
                    break;
        }
        System.out.println("input the principle amount and time");
        int p=sc.nextInt();
        int t=sc.nextInt();
        double interest=p*r*t/1000;
        System.out.println("the interest is \t"+interest);
        double total=interest+p;
        System.out.println("the principle amount is\t"+total);
            
    }
}