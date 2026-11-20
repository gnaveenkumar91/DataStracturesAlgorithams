package com.arrays;

public class MissingNum23 {

	public static void main(String[] args) {
		int arr[]= {1,2,4,5};
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		int actualSum=0;
		
		for(int i=0;i<arr.length;i++) {
			actualSum=actualSum+arr[i];
		}
		int missing=sum-actualSum;
		
		System.out.println(missing);

	}

}
