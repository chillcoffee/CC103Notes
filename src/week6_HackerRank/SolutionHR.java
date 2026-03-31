import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'circularArrayRotation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER k
     *  3. INTEGER_ARRAY queries
     */

    public static LinkedList<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {    
        LinkedList<Integer> answers = new LinkedList<Integer>();
        int[] original = new int[a.size()];
        
        for(int i=0; i<original.length; i++){
          original[i] = a.get(i);
        }
        
        for(int r=0; r<k; r++){
          int[] newArray = rotate(original);
          
          for(int i=0; i<newArray.length; i++){
            original[i] = newArray[i];
          }
        }
        
        for(int index: queries){
          answers.add(original[index]);
        }
        
        return answers;
    }
        
    public static int[] rotate(int[] arr){
      int sz = arr.length;
      int[] rotated = new int[sz];
      
      for(int i =0; i< sz; i++){
        if(i==sz-1)
          rotated[0] = arr[i];
        else
          rotated[i+1] = arr[i];
      }      
      return rotated;
    }
    
    
}

public class SolutionHR {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        int q = Integer.parseInt(firstMultipleInput[2]);

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        List<Integer> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            int queriesItem = Integer.parseInt(bufferedReader.readLine().trim());
            queries.add(queriesItem);
        }

        List<Integer> result = Result.circularArrayRotation(a, k, queries);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
