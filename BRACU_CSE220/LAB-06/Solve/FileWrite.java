//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Lab 06 : Read & Write Text File
package Lab06; // Remove This Line or Make a package

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

    public static void main(String[] args) throws IOException {
        // Change Write Text file Location
        File outputfile = new File("D:\\Projects\\Note\\NetBeansProjects\\CSE220_Labs\\src\\Lab06\\Input.txt");
        if (outputfile.exists()) {
            outputfile.delete(); //you might want to check if delete was successful
        }
        outputfile.createNewFile();

        FileWriter fw = new FileWriter(outputfile);
        for (int i = 0; i < 10; i++) { // This Loop Write 0-9 in Input.txt file
            fw.write(i + "");
        }
        System.out.println("Writing successful");
        //close the file
        fw.close();
    }
}
