import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the quickSort function below.
    static int[] quickSort(int[] arr) {
        int start = 0, stop = arr.length - 1, pivot;
        int lh = start + 1;
        int rh = stop;
        pivot = arr[start];
        while (true) {
            while (lh < rh && arr[rh] >= pivot) {
                rh--;
            }
            while (lh < rh && arr[lh] < pivot) {
                lh++;
            }
            if(lh == rh) {
                break;
            } else {
            // swap(lh, rh);
            int temp = arr[lh];
            arr[lh] = arr[rh];
            arr[rh] = temp;    
            }            
        }
        if (arr[lh] > arr[start]) {
            for (int n: arr) {
             System.out.print(n+" ");
            }
        } else {
            // swap(start, lh);
            int temp1 = arr[start];
            arr[start] = arr[lh];
            arr[lh] = temp1;
            for (int n: arr) {
             System.out.print(n+" ");
            }
        }
        return arr;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = quickSort(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

