package com.arrays;

public class SelectionSort5 {

	public static void main(String[] args) {
		int[] nums = { 10, 34, 76, 12, 1, 65 };
		int temp = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			int minIdx = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j]<nums[minIdx] ) {

					minIdx = j;

				}
			}
				temp=nums[minIdx];
				nums[minIdx]=nums[i];
				nums[i]=temp;
			
		}
		for (int num : nums) {
			System.out.print(num + " ");
		}

	}
}

