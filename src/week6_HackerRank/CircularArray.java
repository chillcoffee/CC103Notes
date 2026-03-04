package week6_HackerRank;

public class CircularArray {

    public static void main(String[] args) {
        int[] original = {3, 2, 1};
        
        for (int k = 0; k < 2; k++) {         
            int[] newArray = rotate(original); //method call to rotate k times
            
            //copy newArray to original;
            for(int i=0; i<newArray.length; i++){
                original[i] = newArray[i];
            }
            
            printArr(original);
        }

    }

    //sample method used to rotate the array
    public static int[] rotate(int[] arr) {
        int sz = arr.length;            //size of array
        int[] rotated = new int[sz];

        for (int i = 0; i < sz; i++) {
            if (i == sz - 1) {          //if dulo na element
                rotated[0] = arr[i];    //ibutang sa index 0
            } else {
                rotated[i + 1] = arr[i];
            }
        }
        return rotated;
    }

    private static void printArr(int[] arr) {
        for(int n: arr){
            System.out.print(n +" ");
        }
        System.out.println("");
    }
}
