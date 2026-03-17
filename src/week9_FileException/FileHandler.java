package week9_FileException;

import java.util.ArrayList;

public interface FileHandler {
    
    public void readFile(String filename);
    public void writeFile(String filename, ArrayList<String> record);
    
}
