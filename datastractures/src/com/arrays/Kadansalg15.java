package com.arrays;
//Maximum sub array
public class Kadansalg15 {

	public static void main(String[] args) {
		int[] arr= {-2,3,-1,5,-6};
		int currentSum=0;
		int max=Integer.MIN_VALUE;//-2147483648
       
		for(int i=0;i<arr.length;i++) {
			currentSum=currentSum+arr[i];
			
			if(currentSum> max) {
				max=currentSum;
			}
			if(currentSum<0) {
				currentSum=0;
			}
		}
		System.out.println("Maximum Sub Aarray is : " +max);
	}

}
