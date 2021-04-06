import java.util.*;
public class Num 
{
    int x;
    boolean isZero()
    {
        if(x==0)
            return true;
        return false;
    }
    boolean isPositive()
    {
        if(x>0)
            return true;
        return false;
    }
    boolean isNegative()
    {
        if(x<0)
            return true;
        return false;
    }
    boolean isEven()
    {
        if(x%2==0)
            return true;
        return false;
    }
    boolean isOdd()
    {
        return(!(isEven()));
    }
    boolean isPrime()
    {
        for(int i=2;i<=x/2;i++)
        {
            if(x%i==0)
                return false;
        }
        return true;
    }
    boolean isArmstrong()
    {
        int sum=0;
        int temp=x;
        while(temp!=0)
        {
            int dig=temp%10;
            sum=sum+(dig*dig*dig);
            temp=temp/10;
        }
        if(sum==x)
            return true;
        return false;
    }
    public static void main(String args[])
    {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scr.nextInt();
        Num obj=new Num();
        obj.x=n;
        System.out.println("zero="+obj.isZero()+"\npositive="+obj.isPositive()+"\nnegative="+obj.isNegative()+
                "\nOdd="+obj.isOdd()+"\nEven="+obj.isEven()+"\nprime="+obj.isPrime()+"\nArmstrong"+obj.isArmstrong());
    }
}
       

        