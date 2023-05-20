//package pkg220_lab6;

import java.io.File;
import java.io.FileWriter; 
import java.io.IOException;
public class FileWrite {
	  public static void main(String[] args) throws IOException 
	    { 
                File outputfile = new File("Put your full file name here");
                if (outputfile.exists()) {
                    outputfile.delete(); //you might want to check if delete was successful
                }
                outputfile.createNewFile();


                FileWriter fw=new FileWriter(outputfile); 
                for (int i = 0; i < 10; i++) {
                    fw.write(i+ "");
                }
                System.out.println("Writing successful"); 
                //close the file  
                fw.close(); 
	    } 
}
