#include<iostream.h>
#include<conio.h>
void main ()
{

int m;
cout<<"enter marks";
cin>>m;
if (100>=m && m>75)
cout<<"A grade";
else if (75>=m && 50<m)
cout<<"B grade";
else if (m>0 && m<=50)
cout<<"fail";

getch();
}