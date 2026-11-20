package com.arrays;

public class Revere2 {

	public static void main(String[] args) throws Exception {
		System.out.println("main method started");
		int num[]= {10,20,30,40,56,67};
		for(int i=num.length-1;i>=0;i--) {
			Thread.sleep(1000);
			System.out.print(num[i]+" ");
		}

	}

}
