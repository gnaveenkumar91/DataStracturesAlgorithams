package com.strings;

import java.util.Scanner;

public class TwoPointerReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a Sring");
		String str = sc.nextLine();

		char[] c = str.toCharArray();

		int low = 0;
		int high = c.length - 1;

		while (low < high) {
			char temp = c[low];
			c[low] = c[high];
			c[high] = temp;
			low++;
			high--;
		}
		
		System.out.println(new String(c));
	}

}
