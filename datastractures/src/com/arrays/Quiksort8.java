package com.arrays;

public class Quiksort8 {

	public static void main(String[] args) {
		int[] arr= {10,2,3,45,6,7,8,1};
		
		quickSort(arr,0,arr.length-1);
		
		  for (int x : arr) {
	            System.out.print(x + " ");
	        }
	}

	private static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
		int pivotIndex=partion(arr,low,high);
		quickSort(arr, low, pivotIndex-1);
		quickSort(arr, pivotIndex+1, high);
		}
	}

	private static int partion(int[] arr, int low, int high) {
		int pivot=arr[low];
		int i=low;
		int j=high;
		while(i<j) {
			while(arr[i]<=pivot && i<high) {
				i++;
			}
			while(arr[j]>pivot && j>low) {
				j--;
			}
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[low];
		arr[low]=arr[j];
		arr[j]=temp;
		return j;
	}

}
