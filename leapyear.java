class leapyear
{
public static void main(String args[])
{
int year;
year= Integer.parseInt(args[0]);
if (year%4==0)
System.out.println("it is a leap year");
else
System.out.println("it is not a leap year");
}
}