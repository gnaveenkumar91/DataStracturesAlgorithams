package com.arrays;

public class EvenOddCOUNT21 {

	public static void main(String[] args) {
		int arr[]= {10,20,33,78,45,2,7,8};
	
	int odd = 0;
	int even = 0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("even :" + even);
		System.out.println("odd :" + odd);

	}

}
