/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.Scanner;

/**
 *
 * @author student
 */
class ExThread implements Runnable{
    String name;
        ExThread(String name){
        this.name=name;
    }
    public void run(){
       System.out.println(name+" is running");
       try{
           Thread.sleep(150);
       }
       catch(InterruptedException e){
           System.out.println("Thread Interrupted");
       }
       System.out.println(name+" is over");
    }
}
public class ThreadState {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ExThread ex1=new ExThread("Ex1");
        Thread t1=new Thread(ex1);
        ExThread ex2=new ExThread("Ex2");
        Thread t2=new Thread(ex2);
        int ch;
        System.out.println("1 for join, 2 for no join");
        ch=sc.nextInt();
        if(ch==1)
        {
            t1.start();
            try{
                t1.join();
            }
            catch (InterruptedException e) {
                System.out.println("Thread Interrupted.");
            }
            t2.start();
        }
        else{
            t1.start();
            t2.start();
        }
        System.out.println("Thread Ex1 is alive: "+t1.isAlive());
        System.out.println("Thread Ex2 is alive: "+t2.isAlive());
    }
}