package com.strings;

import java.util.Scanner;

public class MaximumOccurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a  String");
		String str = sc.nextLine();

		int[] arr = new int[128];

		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
		}
		int max = -1;
		char c = ' ';
		for (int i = 0; i < str.length(); i++) {
			if (max < arr[str.charAt(i)]) {

				max = arr[str.charAt(i)];
				c = str.charAt(i);

			}
		}
		
		System.out.println("frequence of every character");
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(arr[ch]!=0) {
				System.out.println(ch + " = " + arr[ch]);
                arr[ch] = 0;
			}
		}
		 System.out.println("Maximum occurring character: " + c);
	     System.out.println("Maximum frequency: " + max);
	}

}
