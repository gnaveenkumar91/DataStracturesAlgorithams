package com.arrays;

public class FirstLastPosition26 {

    public static void main(String[] args) {

        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int first = -1;
        int last = -1;

        
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {

                first = mid;
                high = mid - 1;
            }
            else if (arr[mid] < target) {

                low = mid + 1;
            }
            else {

                high = mid - 1;
            }
        }

       
        low = 0;
        high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {

                last = mid;
                low = mid + 1;
            }
            else if (arr[mid] < target) {

                low = mid + 1;
            }
            else {

                high = mid - 1;
            }
        }

        System.out.println("First Position: " + first);
        System.out.println("Last Position: " + last);
    }
}