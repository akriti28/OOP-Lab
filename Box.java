import java.util.Scanner;
public class Box 
{
    double height,depth,width;
void input(double h,double w,double d)
{
    height=h;
    width=w;
    depth=d;
}
double volume()
{
    double vol=height*depth*width;
    return vol;
}
public static void main(String args[])
{
    Scanner scr=new Scanner(System.in);
    System.out.println("Enter the height,width and depth");
    double h=scr.nextDouble();
    double w=scr.nextDouble();
    double d=scr.nextDouble();
    Box obj=new Box();
    obj.input(h, w, d);
    System.out.println("Volume="+obj.volume());
}
}
