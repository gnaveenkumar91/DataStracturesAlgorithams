package com.dp;

import java.util.Scanner;

//bootom-up approach-->reducing space complexity
public class FibonacciSpaceOptimized5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int prev2 = 0;
		int prev1 = 1;

		if (n == 0) {
			System.out.println(0);
		} else if (n == 1) {
			System.out.println(1);
		} else {

			for (int i = 2; i <= n; i++) {

				int current = prev1 + prev2;

				prev2 = prev1;
				prev1 = current;
			}

			System.out.println(prev1);
		}

	}

}
