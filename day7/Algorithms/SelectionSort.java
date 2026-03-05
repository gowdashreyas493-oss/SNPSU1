package day7.Algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int minindex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;

                }
            }
            if(minindex!=i){
                int temp=arr[i];
                arr[i]=arr[minindex];
                arr[minindex]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={7,8,9,2,3,3,0,9,5,6,};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
