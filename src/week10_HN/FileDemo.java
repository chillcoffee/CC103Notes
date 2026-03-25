package week10_HN;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileDemo {

    

    public static void main(String[] args) {
        FileDemo fd = new FileDemo();

        fd.writeFile();
        fd.readFile();
    }

    public void writeFile() {
        Scanner s = new Scanner(System.in);
        File file = new File("shoes.txt");
        try {
            FileWriter fw = new FileWriter(file, true);
            System.out.println("Enter product names: ");
            for (int i = 0; i < 3; i++) {
                String product = s.nextLine();
                fw.write(product + "\n");                
            }
            System.out.println("Writing done.");
            fw.close();
        } catch (IOException ex) {
            System.out.println("Output file not found.");
        } 
    }

    public void readFile() {
        /*  File instantiation
            Scanner instantiation
            try to open the file
            read using scanner obj
            close the file
         */
        File file = new File("shoes.txt");
        System.out.println("\nYour products: ");
        try {
            Scanner fs = new Scanner(file);
            while (fs.hasNext()) {
                String brand = fs.nextLine().trim();
                System.out.println(brand);
            }
            fs.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found. Check directory.");
        }
    }
}
