class prime
{
public static void main (String args[])
{

int n = Integer.parseInt(args[0]);
int flag=0;
for (int i=2; i<n/2;i++)
{ 
if (n%i==0)
flag=0;
}

if (flag==0)
System.out.println("it is not a prime");

else
System.out.println ( " it is a prime");
}
}