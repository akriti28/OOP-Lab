/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab7;

import java.util.Scanner;

/**
 *
 * @author Guestmit
 */
class MarksOutOfBounds extends Exception{
MarksOutOfBounds(String s){
super(s);
}
}
class Student{
    int marks;
            Student(int m)
            {marks=m;}
public static void val(int m) throws MarksOutOfBounds{
if(m>100)
    System.out.println("Invalid");
else
    System.out.println("Your score is "+m);}
}
public class StudentMarks {
    public static void main(String []args) throws MarksOutOfBounds{
        System.out.println("Enter marks ");
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        Student st=new Student(t);
        Student.val(t);
    }
}
    

