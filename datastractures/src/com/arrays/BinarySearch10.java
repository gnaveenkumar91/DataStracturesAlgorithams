package com.arrays;

import java.util.Scanner;

public class BinarySearch10 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 ,60};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the key");
		int key = sc.nextInt();

		System.out.println("key found : " + binarySearch(arr, key));

	}

	private static int binarySearch(int[] arr, int key) {
		int low=0;//Lowest possible index 0
		int high=arr.length-1;//highest possible index 5
		
             while(low<=high) {
            	 int mid=low+(high-low)/2;
            	 if(arr[mid]== key) {
            		 return mid;//best case
            	 }else if(key<arr[mid]) {
            		 high=mid-1;//reducing the upper bound(search left side)
            	 }else {
            		 low=mid+1;//reducing the lower bound(search right side)
            	 }
             }
		return -1;
	}

}
