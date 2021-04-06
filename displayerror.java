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
class Square extends Exception {
    
    int m,n;
    String s;
    public Square(int m, int n){
    this.m=m;
    this.n=n;
    }
    @Override
    public String toString(){
        return "INVALID : It cannot be Square Matrix";
    }
}
class Neg extends Exception{
    int m;
    String s;
    public Neg(int m){this.m=m;}
    @Override
    public String toString(){
        return "INVALID : square root of negative number cant be found";
                }
}
public class displayerror {
    public static void main(String []args)
    {
    
    System.out.println("1. Check if it can be a square matrix");
    System.out.println("2. Finding the Root of a Number");
    int ch;
    Scanner sc=new Scanner(System.in);
    ch=sc.nextInt();
    switch(ch){
        case 1:
            System.out.println("Enter the row and column of the matrix:");
            int b=sc.nextInt();
            int c=sc.nextInt();
            try {
            if(b!=c)
                throw new Square(b,c);
            }
            catch (Square e)
            {
                System.out.println(e);
            }
            if (b==c)
                System.out.println("It can be a square matrix");
    break;
            
            
        case 2:System.out.println("Enter a number");
        int a=sc.nextInt();
        try{       
        if(a<0)
            throw new Neg(a);
        }
        catch (Neg e)
        {
            System.out.println(e);
        }
        if (a==0 || a>0) 
            System.out.println("Root is "+Math.sqrt(a));
    break;
        default:System.out.println("invalid");
    }
    }
}
    

