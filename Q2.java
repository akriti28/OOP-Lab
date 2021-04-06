/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab10;

/**
 *
 * @author Guestmit
 */
import java.util.*;
import java.io.*;
public class Q2 {
    
    public static void main(String[]args) throws FileNotFoundException        
    { 
            Scanner console = new Scanner(System.in);           

            System.out.println("File to be read: ");
            String inputFile = console.next();

            File file = new File(inputFile);
            Scanner in = new Scanner(file);

            int words = 0;
            int lines = 0;
            int chars = 0;

            while(in.hasNext())
            {
                in.next();
                words++;
            }

            while(in.hasNextLine())
            {
                in.nextLine();
                lines++;
            }

            while(in.hasNextByte())
            {
                in.nextByte();
                chars++;
            }

            System.out.println("Number of lines: " + lines);
            System.out.println("Number of words: " + words);
            System.out.println("Number of characters: " + chars);
    }
}

