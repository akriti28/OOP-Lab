import java.util.*;
public class Time
{
    int hr,min,sec;
    Time()
    {
        hr=min=sec=0;
    }
    Time(int h,int m,int s)
    {
        hr=h;
        min=m;
        sec=s;
    }
    void display()
    {
        String output="";
        if(hr<10)
            System.out.print("0");
        System.out.print(hr+":");
        if(min<10)
            System.out.print("0");
        System.out.print(min+":");
        if(sec<10)
            System.out.print("0");
        System.out.println(sec);
    }
    Time add(Time a,Time b)
    {
        Time c=new Time();
        int tot=(a.hr+b.hr)*3600+(a.min+b.min)*60+a.sec+b.sec;
        c.hr=tot/3600;
        tot=tot%3600;
        c.min=tot/60;
        c.sec=tot%60;
        return c;
    }
    public static void main(String args[])
    {
        int h,m,s;
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter the hr,min and sec");
        h=scr.nextInt();
        m=scr.nextInt();
        s=scr.nextInt();
        Time a=new Time(h,m,s);
         System.out.println("Enter the hr,min and sec");
        h=scr.nextInt();
        m=scr.nextInt();
        s=scr.nextInt();
        Time b=new Time(h,m,s);
        Time c=new Time();
        c=c.add(a, b);
        System.out.print("Time 1=");
        a.display();
        System.out.print("Time 2=");
        b.display();
        System.out.print("Total=");
        c.display();
    }
}
