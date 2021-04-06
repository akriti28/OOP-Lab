/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab10;

/**
 *
 * @author Guestmit
 */ import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.*;

public class Q1 {
   
public static void main(String[] args) throws IOException {

try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Guestmit\\Desktop\\lab10a.txt")))
		{

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} 

      
                    String content = "This is the content to write into file";

			File file = new File("C:\\Users\\Guestmit\\Desktop\\lab10c.txt");

			

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
    try (BufferedWriter bw = new BufferedWriter(fw)) {
        bw.write(content);
    }

			System.out.println("Done");
              
          FileInputStream fis ;
          FileOutputStream fos;

          try{
               fis = new  FileInputStream("C:\\Users\\Guestmit\\Desktop\\lab10a.txt");
               fos = new FileOutputStream("C:\\Users\\Guestmit\\Desktop\\lab10c.txt");

 
    	    byte[] buffer = new byte[1024];
 
    	    int length;
    	    /*copying the contents from input stream to
    	     * output stream using read and write methods
    	     */
    	    while ((length = fis.read(buffer)) > 0){
    	    	fos.write(buffer, 0, length);
    	    }

    	    //Closing the input/output file streams
    	   fis.close();
    	   fos.close();

    	    System.out.println("File copied successfully!!");
 
    	}catch(IOException ioe){
    		ioe.printStackTrace();
}
}
}

