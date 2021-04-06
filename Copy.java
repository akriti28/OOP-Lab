/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab_10;

/**
 *
 * @author Guestmit
 */

import java.io.*;
import java.util.*;


class Tody extends Thread{
Thread t1;
Thread t2;
public int count;
public String s;
String s2;
int time;
Tody(){
        count=0;
        t1=new Thread(this);
        t2=new Thread(this);
}
void geto()throws IOException{
    
     FileWriter fodi=null;
        File f=new File("ande.txt");
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        fodi =new FileWriter(f);
        fodi.write(s);
        fodi.close();
}
@Override
public void run(){
    int i,j;
    for(i=0;;i++){
        for(j=0;j<20;j++){
        count++;
        }}
}
void encrypt(Tody r) throws FileNotFoundException, IOException{

     try (InputStream is = new FileInputStream("test.txt")) {
           int size = s.length();
           int t;
           for(int i=0; i< size; i++) {
               t=i+3;
               if(t>size-3)
                   t-=size;
               char c=s.charAt(t);
               c+=r.count;
               s2+=c;
               time=count;   
               
           }
     is.close();
     
     }}
void decrypt(){
    int t;
    for(int i=0;i<s2.length();i++){
        t=i+3;
        if(t>s2.length())
            t-=s2.length();
System.out.println((s2.charAt(t)-time));
        }
}
}
public class Copy{
    void ch1() throws IOException{
    byte a[]={1,32,'y',79,90};
       try (OutputStream os = new FileOutputStream("test.txt")) {
           for(int i=0; i < a.length ; i++) {
               os.write( a[i] ); // writes the bytes
           }os.close();
       }
       try (InputStream is = new FileInputStream("test.txt")) {
           int size = is.available();

           for(int i=0; i< size; i++) {
               System.out.print((char)is.read() + " ");
           }
       }
         catch(IOException e) {
            System.out.print("Exception");
        }
   
    }
    void ch2()throws IOException{
        
        String s;
        FileWriter fodi=null;
        File f=new File("ande.txt");
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        fodi =new FileWriter(f);
        fodi.write(s);
        fodi.close();
     
       try (InputStream is = new FileInputStream("test.txt")) {
           int size = s.length();
         int count=0,count2=0,count3=0,count1=0;
           for(int i=0; i<=size; i++) {
               char c=(char)is.read();
               switch(c){
                   case 'a':
                   case 'e':
                   case 'i':
                   case 'o':
                   case 'u':
                   case 'A':
                   case 'E':
                   case 'I':
                   case 'O':
                   case 'U':
                       count++;
                       count1++;
                   break;
                   case '.':
                       count2++;
                       count3++;
                       break;
                   case ' ':
                       count3++;
                       break;
                   default:
                       count1++;
               
    }}
                      
       System.out.println("No of characters:"+ count1);
       System.out.println("No of vowels:"+count);
       System.out.println("No of lines:"+count2);
       System.out.println("No of words"+count3);
      }
       catch(IOException e) {
            System.out.print("Exception");
        }
    }
    
     void ch3() throws IOException{
         String s;
       
        
     }  
       
   public static void main(String args[]) throws IOException
   {
       Copy zh=new Copy();
       System.out.println("MENU");
       System.out.println("1.write to a file, read from the file, copy bytes from one file to another");
       System.out.println("2.to count the no of characters, vowels, lines and words in a given file");
       System.out.println("3.to encrypt and decrypt the file");
       Scanner sc=new Scanner(System.in);
       int ch=sc.nextInt();
       switch(ch){
           case 1:zh.ch1();
       break;
           case 2:zh.ch2();
       break;
           case 3: 
               Tody dh=new Tody();
               Tody zl=new Tody();
               dh.start();
               zl.geto();
               zl.encrypt(dh);
               zl.decrypt();
       break;
           default:
               System.out.println("Invalid choice");
       }
   }
    }

