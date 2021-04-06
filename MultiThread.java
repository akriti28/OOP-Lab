/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

class DemoThread implements Runnable {
   private String name;
   
   DemoThread( String name){
       this.name = name;
       System.out.println("Creating " +  name );
   }
   public void run() {
      System.out.println("Running " +  name );
      try {
         for(int i=0; i<3; i++) {
            System.out.println("This is "+name);
            Thread.sleep(150);
         }
     } catch (InterruptedException e) {
         System.out.println(name + " Interrupted.");
     }
     System.out.println(name + " Exiting.");
   }

}

public class MultiThread {
   public static void main(String args[]) {
   
      DemoThread Demo1 = new DemoThread( "1");
      Thread DemoT=new Thread(Demo1);
      DemoT.start();
      
      DemoThread Demo2 = new DemoThread( "2");
      Thread DemoT2=new Thread(Demo2);
      DemoT2.start();
   }   
}