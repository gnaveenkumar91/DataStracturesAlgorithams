package com.dp;

import java.util.Scanner;

public class CIimbingStairs6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n <= 0) {
			System.out.println(0);
			return;
		}
		if (n == 1) {
			System.out.println(1);
			return;
		}
		if (n == 2) {
			System.out.println(2);
			return;
		}

		int[] dp = new int[n + 1];

		dp[1] = 1;
		dp[2] = 2;

		for (int i = 3; i < dp.length; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		System.out.println(dp[n]);
	}

}
