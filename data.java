
import java.util.Scanner;
class data
{
public static void main(String args[])
{ 
Scanner fn = new Scanner(System.in);
System.out.println("enter an integer");
int integer = fn.nextInt();
System.out.println("enter a char");
char character = fn.next().charAt(0);
System.out.println(character);
System.out.println("enter a decimal number");
double decimal = fn.nextDouble();

byte a = (byte) integer;
int b = (int) character;
byte c= (byte) decimal;
int d= (int) decimal;

System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);

}
}