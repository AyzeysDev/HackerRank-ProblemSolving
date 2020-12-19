import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the closestNumbers function below.
    static int[] closestNumbers(int[] arr) {
                Arrays.sort(arr);
        int[] res = new int[arr.length];
        int in =0;
        int minDiff = Integer.MAX_VALUE;
        int d =0;
        for(int i =0; i <arr.length-1 ;i++){
            d = Math.abs(arr[i]-arr[i+1]);
            if(d < minDiff){
                minDiff = d;
            }
        }
        for(int i =0; i< arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                d = Math.abs(arr[i]-arr[j]);
                if(d == minDiff){
                    res[in] = arr[i];
                    res[in+1] = arr[j];
                    in += 2;
                    continue;
                }
                break;  
            }
        }
        
        return Arrays.copyOf(res, in);

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

        int[] result = closestNumbers(arr);

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

