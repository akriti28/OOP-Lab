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
public class Negativearraysize {
    public static void main(String args[])
    { 
        System.out.println("enter size of array");
        Scanner sc=new Scanner(System.in);
        try 
        {
            int a=sc.nextInt();
            if (a<0)
            throw new NegativeArraySizeException();
        
        int b[]=new int[a];
        }
        
            catch (NegativeArraySizeException e)
                { System.out.println("negative array size error" +e);
                
        }
        
        
    }
    
    }
