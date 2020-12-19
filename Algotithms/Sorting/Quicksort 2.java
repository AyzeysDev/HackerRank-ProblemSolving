import java.io.*;
import java.util.*;

public class Solution {
            static void quickSort(int[] arr,int lo,int hi) {
            if(lo<hi){
            int pivot=arr[lo];
            int pi=partition(arr,pivot,lo,hi);
            quickSort(arr,lo,pi-1);
            quickSort(arr,pi+1,hi);
            printArray(arr,lo, hi);
            }
        }
        static void printArray(int[] arr,int start, int end) { 
            for(int i = start; i <= end;i++) 
                System.out.print(arr[i]+" "); 
            System.out.println(); 
        }    
        static int partition(int[] arr,int pivot,int lo,int hi) {
                int index=lo+1;
                int pivotPosition=lo,e;
                while(index<=hi)
                    {
                        if(arr[index]<pivot) 
                            {    
                             e=arr[index];
                            for(int j=index-1;j>=pivotPosition;j--) 
                                arr[j+1]=arr[j];    
                                arr[pivotPosition]=e;
                                pivotPosition++;
                            }
                        index++;
                    }
                
                return pivotPosition;
        }
    
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
                
        int arr[]=new int[n];
        for(int i=0;i<n;i++)  {
            arr[i]=sc.nextInt();
        }
        quickSort(arr,0,n-1);
    }
}
