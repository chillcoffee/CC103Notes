package week6_HackerRank;

import java.util.LinkedList;

public class CircularArray {

    public static void main(String[] args) {
        int[] original = {45, 20, 36, 12, 52, 56};
//          int[] original = {3, 2, 1}; int 
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(3);
        list.add(2);
             
        
        for (int k = 0; k < 10; k++) {         
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

