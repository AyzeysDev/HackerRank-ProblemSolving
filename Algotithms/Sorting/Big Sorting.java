import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the bigSorting function below.
    static String[] bigSorting(String[] unsorted) {
        int size = unsorted.length;
        MyComparator comp = new MyComparator();
        Arrays.sort(unsorted, comp);
        return unsorted;
}

private static class MyComparator implements Comparator<String> {
    public int compare(String s1, String s2) 
    { 
        if (s1.length() == s2.length())
            return s1.compareTo(s2);
            
        return s1.length() - s2.length();
    } 
}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String[] unsorted;
    try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
        int n = Integer.parseInt(reader.readLine());
        unsorted = new String[n];

        for (int i = 0; i < n; i++) {
            unsorted[i] = reader.readLine();
        }
    }

    String[] result = bigSorting(unsorted);

    try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))) {
        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();
    }
}
}
