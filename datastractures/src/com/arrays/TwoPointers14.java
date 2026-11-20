package com.arrays;

public class TwoPointers14 {

	public static void main(String[] args) {
		int[] arr = {60, 20, 30, 40, 5};
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
		for(int a:arr) {
			System.out.print(a + " ");
		}

	}

}
