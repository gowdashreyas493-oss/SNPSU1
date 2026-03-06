package day7.Algorithms;

import java.util.Arrays;

public class QuickSort {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partitionIndex(int[] arr, int s, int e) {

        int pivot = arr[s];
        int count = 0;

        for (int i = s + 1; i <= e; i++) {
            if (arr[i] < pivot) {
                count++;
            }
        }

        int pivotIndex = s + count;

        // place pivot at correct position
        swap(arr, s, pivotIndex);

        int i = s;
        int j = e;

        while (i < pivotIndex && j > pivotIndex) {

            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i < pivotIndex && j > pivotIndex) {
                swap(arr, i++, j--);
            }
        }

        return pivotIndex;
    }

    public static void quickSort(int[] arr, int s, int e) {

        if (s >= e) {
            return;
        }

        int p = partitionIndex(arr, s, e);

        quickSort(arr, s, p - 1);
        quickSort(arr, p + 1, e);
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 4, 2, 7};

        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}