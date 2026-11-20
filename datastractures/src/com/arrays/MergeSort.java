package com.arrays;

import java.util.Arrays;

public class MergeSort {
	public static void divide(int[] arr){
		if(arr.length==1) {
			return;
		}
		int[] left=new int[arr.length/2];
		int[] right=new int[arr.length-left.length];
		
		int i;//using for both left and right
		for( i=0;i<left.length;i++) {
			left[i]=arr[i];	
		}
		for(int j=0;j<right.length;j++) {
			right[j]=arr[i++];
		}
		divide(left);
		System.out.println("LEFT SIDE ELEMNTS : " +Arrays.toString(left));
		divide(right);
		System.out.println("RIGHT SIDE ELEMNTS : " +Arrays.toString(right));
		merge(left,right,arr);
	}
	static void merge(int[] l,int[] r,int[] arr) {
		int i=0;
		int j=0;
		int k=0;
		
		//compare and merge
		while(i<l.length && j<r.length) {
			if(l[i]<r[j]) {
				arr[k++]=l[i++];
			}else {
				arr[k++]=r[j++];
			}
		}
		//remaining value checking
		while(i<l.length) {
			arr[k++]=l[i++];
		}
		
		while(j< r.length) {
			arr[k++]=r[j++];
		}
		
	}

	public static void main(String[] args) {
		int[] arr= {6,5,4,3};
		divide(arr);
		System.out.println("After Sorting : " + Arrays.toString(arr));

	}

}
