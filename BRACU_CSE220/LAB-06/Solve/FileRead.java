//Name: Shafkat Hasan
//ID: 19101077
//Section: 07
//Lab 06 : Read & Write Text File
package Lab06; // Remove This Line or Make a package

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {

    public static void main(String[] args) throws IOException {
        String str = "";
        // Change Read Text file Location
        File inputFile = new File("D:\\Projects\\Note\\NetBeansProjects\\CSE220_Labs\\src\\Lab06\\Output.txt");

        try {
            Scanner sc = new Scanner(inputFile);
            while (sc.hasNext()) { // This Loop Read Text from Output.txt file; There Sould Be Some Text in file;
                str = sc.nextLine();
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Check specified directory or create the file first");
        }
    }
}
