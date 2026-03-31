package week10_IST;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandler {

    public static void main(String[] args) {
        FileHandler fh = new FileHandler();
        fh.writeFile();
        fh.readFile();
    }

    public void readFile() {
        File file = new File("users.txt");
        try {
            Scanner fs = new Scanner(file);
            while (fs.hasNext()) {
                String name = fs.nextLine();
                System.out.println(name);
            }
            fs.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Check directory or file name.");
        }
    }

    private void writeFile() {
        File file = new File("users.txt");
        try {
            FileWriter fw = new FileWriter(file, true);
            fw.write("\nelaris");

            System.out.println("Writing done.");
            fw.close();
        } catch (IOException ex) {
            System.out.println("blabla bla");
        }
    }

}
