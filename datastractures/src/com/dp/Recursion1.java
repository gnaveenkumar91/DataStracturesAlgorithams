package com.dp;

import java.util.Scanner;

public class Recursion1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		recursion(n);

	}

	private static void recursion(int n) {
		if (n == 0) {
			return;

		}
		System.out.println(n);
		recursion(n-1);
		

	}

}
