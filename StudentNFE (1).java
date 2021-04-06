/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab7;

/**
 *
 * @author Guestmit
 */
import java.util.Scanner;
class Student {
  public:
        String name;
	Float s1=0,s2=0,s3=0,per=0;
	int rollno;
	char grade=' ';
		
}
public class StudentNFE{

    public static void main(String[] args) {
          Student a[]=new Student[3];
		  Scanner s=new Scanner(System.in);
		  for(int i=0;i<3;i++)
		  {	  
          System.out.println("Enter Name");
                 a[i].name=s.next();
		  System.out.println("Enter Roll Number");
		  a[i].rollno=s.nextInt();
		  System.out.println("Enter Marks out of 100 in subject 1");
		  try{
		  a[i].s1=Float.parseFloat(s.next());
		  System.out.println("subject 2");
		  a[i].s2=Float.parseFloat(s.next());
		  System.out.println("subject 3");
		  a[i].s3=Float.parseFloat(s.next());
		 
			a[i].per=(a[i].s1+a[i].s2+a[i].s3)/3;		
		if(a[i].per<40)
			a[i].grade='F';	
                else if(a[i].per>=40 && a[i].per<50)
			a[i].grade='E';
		else if(a[i].per>=50 && a[i].per<60)
			a[i].grade='D';
		else if(a[i].per>=60 && a[i].per<75)
			a[i].grade='C';
		else if(a[i].per>=75 && a[i].per<90)
			a[i].grade='B';
		else if(a[i].per>=90)
			a[i].grade='A';
                        
		
		System.out.println("Percentage of student "+(i+1)+" is "+a[i].per+" and grade is "+a[i].grade);
		  }
		   
        catch(NumberFormatException e)
                {
                    System.out.println("INVALID");
                }
		
		  }
		
    }
}
        
      