/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.Scanner;

class IThread implements Runnable{
    public void run(){
        System.out.println("Thread from Runnable");
    }
}
class CThread extends Thread{
    public void run(){
        System.out.println("Thread from Thread class");
    }
}
public class ThreadEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int ch;
       do{
           System.out.println("1.Thread from Interface \n2.Thread from Class\n3.Exit");
           ch=sc.nextInt();
           switch(ch){
                case 1: 
                    IThread iThread=new IThread();
                    Thread newThread=new Thread(iThread);
                    newThread.run();
                    break;
                case 2:
                    CThread cThread=new CThread();
                    cThread.run();
                    break;
           }
       }while(ch!=3);
    }
    
}