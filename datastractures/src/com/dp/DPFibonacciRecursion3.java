package com.dp;

import java.util.Arrays;
import java.util.Scanner;
//Memorization-->Top down dp
public class DPFibonacciRecursion3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] dp = new int[n + 1];

		Arrays.fill(dp, -1);
		System.out.println(fib(n, dp));

	}

	private static int fib(int n, int[] dp) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		if (dp[n] != -1) {
			return dp[n];
		}
		dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
		return dp[n];
	}

}
