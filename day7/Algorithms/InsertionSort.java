package day7.Algorithms;

import java.util.*;
public class InsertionSort {
    public static void InsertionSort(int[] arr){
        for (int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>temp){
                // Shift Operation
                arr[j+1]=arr[j];
                j--;  // Create empty space[ ] by shifting.
            }
            arr[j+1]=temp;  // Fill the sapce [ ] with the temp variable.
        }
    }
    public static void main(String[] args) {
        int[] arr={5,8,-1,2,4,9,6};
        System.out.println(Arrays.toString(arr));
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
