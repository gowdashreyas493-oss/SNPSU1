package day7.Algorithms.binarySearchApplications;

public class FirstLastTotalOcc {

    public static int firstOcc(int[] arr, int key) {

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                ans = mid;
                end = mid - 1;   // move left
            }
            else if (arr[mid] < key) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int lastOcc(int[] arr, int key) {

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                ans = mid;
                start = mid + 1;   // move right
            }
            else if (arr[mid] < key) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,3,3,4,5};
        int key = 3;

        int first = firstOcc(arr, key);
        int last = lastOcc(arr, key);

        int total = last - first + 1;

        System.out.println("First Occurrence: " + first);
        System.out.println("Last Occurrence: " + last);
        System.out.println("Total Occurrences: " + total);
    }
}