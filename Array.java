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
public class Array{
    public static void main(String[] args) {
     

      int array[]={20,20,40};
     
      try {
       
       
         for(int i =5;i >=0; i--) {
            System.out.println
            ("The value of array is" +array[i]);
         }
      }
      catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Array is out of Bounds"+e);
      }
     
   }

    
}
    
