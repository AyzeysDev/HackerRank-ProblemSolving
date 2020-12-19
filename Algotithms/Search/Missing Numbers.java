import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the missingNumbers function below.
    static int[] missingNumbers(int[] arr, int[] brr) {
        int[] arrFreq = new int[10001];
        int[] brrFreq = new int[10001];
        TreeSet<Integer> tSet = new TreeSet<Integer>();
        
        Arrays.fill(arrFreq, 0);
        Arrays.fill(brrFreq, 0);
        for (int i=0; i<arr.length; i++) {
            arrFreq[arr[i]]++;
        }
        for (int i=0; i<brr.length; i++) {
            brrFreq[brr[i]]++;
        }
        for (int i=0; i<brr.length; i++) {
            if(arrFreq[brr[i]] != brrFreq[brr[i]]) {
                tSet.add(brr[i]);
            }
        }
        int res[] = new int[tSet.size()];
        Iterator i = tSet.iterator();
        int j=0;
        while (i.hasNext()) {
         res[j] = (int)i.next();
         j++;
      }
    return res;
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

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] brr = new int[m];

        String[] brrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrItems[i]);
            brr[i] = brrItem;
        }

        int[] result = missingNumbers(arr, brr);

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

