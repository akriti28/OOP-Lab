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
import java.util.*;
public class Num
{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
    String s;
    s = sc.nextLine();
    try 
    { 
       int i=Integer.parseInt(s) ;
    }
    catch(NumberFormatException e)
    {
        System.out.println("error");
    }
  
    }
}

