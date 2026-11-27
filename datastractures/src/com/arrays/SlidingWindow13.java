package com.arrays;

public class SlidingWindow13 {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,10,10,20};
		int days=3;
		int sum=0;
		for(int i=0;i<days;i++) {
			sum=sum+arr[i];
		}
		int avg=sum/days;
		System.out.println("First visited total sum ; " + sum);
		System.out.println("Avg :" + avg);
		
		for(int i=1;i<=arr.length-days;i++) {
			sum=sum - arr[i-1] + arr[days+i-1];
			avg=sum/days;
			System.out.println("total number of visited : " +sum);
			System.out.println("Avg :" + avg);
		}

	}

}
