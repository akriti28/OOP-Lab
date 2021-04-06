class datatype
{
public static void main(String args[])
{
Scanner fn = new Scanner (System.in);
System.out.println("enter an integer");
int integer = fn.nextInt();
System.out.println("enter a char");
char character = fn.nextLine();
System.out.println("enter a decimal number");
double decimal = fn.nextDouble();

byte a = integer;
int b = character;
byte c= decimal;
int d= decimal;

System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);

}
}