package com.arrays;

public class TwoSum16 {

	public static void main(String[] args) {
		//without aiobe
//		int[] arr = {1, 2, 3, 5};
//		    int target = 9;      
//	        int[] num = twoSum(arr, target);
//
//	        if (num.length == 0) {
//	            System.out.println("No pair found");
//	        } else {
//	            System.out.println("First Index: " + num[0]);
//	            System.out.println("Second Index: " + num[1]);
//	        }
		
		int[] arr= {1,2,3,5};
		int[] num= twoSum(arr,8);
		
		System.out.println(num[0]);
		System.out.println(num[1]);
        
	}

	private static int[] twoSum(int[] arr, int target) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {};
		 //return new int[0];
	}

}
