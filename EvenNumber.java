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
 */class EvenNumberException extends Exception{
     
     EvenNumberException(int b)
     {      
         
     }
     
    
     @Override
     public String toString()

     {
         return "INVALID - it is even";
         
     }
 }

public class EvenNumber{
   public static void main(String args[])
    {
    System.out.println("enter number");
    
    Scanner sc=new Scanner(System.in);
    try {
       int a= sc.nextInt();
        if ((a%2)==0)
            throw new EvenNumberException(1);
        
    }
        
    catch (EvenNumberException e)
    { 
        System.out.println(e);
    }
        
    }
}
 
    
