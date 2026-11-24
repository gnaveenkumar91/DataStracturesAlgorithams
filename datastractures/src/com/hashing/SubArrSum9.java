package com.hashing;

//using nested loops--
public class SubArrSum9 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		int k = 3;
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum = sum + arr[j];
               if(sum==k) {
            	   count++;
               }
			}
		}
		System.out.println(count);

	}

}
