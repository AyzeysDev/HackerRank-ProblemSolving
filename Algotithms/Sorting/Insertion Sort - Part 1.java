import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) {
        int in, out;
        for (out = arr.length-1; out < arr.length; out++) {
            int value = arr[arr.length - 1];  
            in = out; 
            while (in > 0 && arr[in-1] >  value) {
                arr[in] = arr [in-1];
                for(int j: arr){
                    System.out.print(j+" ");
                }
                System.out.println("");
                --in;
            }
            arr[in] = value;
            for(int j: arr){
             System.out.print(j+" ");
            }
            System.out.println("");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort1(n, arr);

        scanner.close();
    }
}

