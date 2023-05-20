//package pkg220_lab6;

import java.io.File;
import java.io.FileNotFoundException; 
import java.io.IOException;
import java.util.Scanner; 

public class FileRead {
    public static void main(String[] args) throws IOException 
    { 
    	String str = "";
    	File inputFile = new File("Put your full file name here");
    	 
    	 try {
             Scanner sc = new Scanner(inputFile);
             while (sc.hasNext()){
            	  str = sc.nextLine();
            	 System.out.println(str);
             }
         } catch (FileNotFoundException e) {
             System.out.println("File not found. Check specified directory or create the file first");
         }
    } 
}
