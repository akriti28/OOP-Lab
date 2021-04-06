import java.util.*;
class account
{
    String cus_name,type;
    int acc_no;
    account(String c,int a,String t)
    {
        cus_name=c;
        acc_no=a;
        type=t;
    }
}

class saving extends account
{
    double balance;
    saving (String c,int a,String t,double b)
    {
        super (c,a,t);
        balance=b;
    }
    void acc(int d)
    {
        balance+=d;
    }
    void display()
    {
        System.out.println("the total balance is \t"+balance);
    }
    void interest(int in)
    {
        double inter=balance*in/100;
        balance+=inter;
    }
    void with(double w)
    {
        if(w<balance)
        {
            System.out.println("withdrawal is permitted\t");
            balance-=w;
        }
        else
            System.out.println("withdrawal can not be permitted");
    }
}

class current extends account
{
   double balance;
    current (String c,int a,String t,double b)
    {
        super (c,a,t);
        balance=b;
    }
    void acc(int d)
    {
        balance+=d;
    }
    void display()
    {
        System.out.println("the total balance is \t"+balance);
    } 
    void min_bal(int min,int st)
    {
        if(balance<min)
        {
            double s=st*balance/100;
            System.out.println(s+"  amount is being imposed as service tax");
            balance-=s;
        }
    }
    void with(double w)
    {
        if(w<balance)
        {
            System.out.println("withdrawal is permitted\t");
            balance-=w;
        }
        else
            System.out.println("withdrawal can not be permitted");
    }
}
       
