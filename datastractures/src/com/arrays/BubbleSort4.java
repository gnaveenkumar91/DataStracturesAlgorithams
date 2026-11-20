package com.arrays;

public class BubbleSort4 {

	public static void main(String[] args) {
		System.out.println("---------");
		
		int[] num= {60,20,3,4,2,56,76,32};
		int temp=0;
		int count=0;
		for(int i=0;i<num.length;i++) {
			boolean swapped=false;
			for(int j=0;j<num.length-1-i;j++) {
				if(num[j]>num[j+1]) {//if(num[j+1]<num[j])
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
					swapped=true;
				}
			}
			count++;
			if(!swapped) {
				break;
			}
		}
		for(int n:num) {
			System.out.print(n + " ");
		}
		System.out.println("Passes: " + count);
	}

}
