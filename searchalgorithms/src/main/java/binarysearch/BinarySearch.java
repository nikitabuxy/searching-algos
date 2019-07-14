package binarysearch;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String args[]) {
        int input[] = new int[]{2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        Scanner scanner = new Scanner(System.in);
        System.out.println("element to Search: ");
        int element = scanner.nextInt();
        int index = binarySearch(input, element);
        if(index >= 0)
            System.out.println("Element found at " + (index + 1));
        else{
            System.out.println("Element not available!! ");
        }

    }

    private static int binarySearch(int[] arr, int element) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while (right >= left) {
            mid = left + ((right - left) / 2);
            if (element == arr[mid]) {
                return mid;
            } else if (element > arr[mid]) {
                left = mid + 1;
            } else if (element < arr[mid]) {
                right = mid - 1;
            }
        }
        return -1;
    }
}
