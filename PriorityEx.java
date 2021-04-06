/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

class SomeThread extends Thread{
    String name;
    SomeThread(String name){
        this.name=name;
    }
    public void run(){  
        System.out.println(name+" Running");  
        System.out.println(name+" priority is: "+Thread.currentThread().getPriority());  
        try{
            Thread.sleep(500);
        }
        catch (InterruptedException e) {
                System.out.println("Thread Interrupted.");
        }
    } 
}
public class PriorityEx{
    public static void main(String args[]){  
        SomeThread t1=new SomeThread("Thread 1");  
        SomeThread t2=new SomeThread("Thread 2");  
        SomeThread t3=new SomeThread("Thread 3");  
        t1.setPriority(Thread.MIN_PRIORITY);  
        t2.setPriority(Thread.MAX_PRIORITY);  
        t3.setPriority(Thread.NORM_PRIORITY+1);
        t1.start();
        t1.interrupt();
        t2.start();
        t3.start();  
    }
}  