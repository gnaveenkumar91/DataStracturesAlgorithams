package com.mock;

import java.util.Scanner;

public class MaximSubArraySwapping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int max = Integer.MIN_VALUE;

		if (k == 1) {

			for (int i = 0; i < arr.length; i++) {

				for (int j = i + 1; j < arr.length; j++) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

					int sum = 0;

					for (int x = 0; x < arr.length; x++) {

						sum = sum + arr[x];

						if (sum > max) {
							max = sum;
						}
						if (sum < 0) {
							sum = 0;
						}
					}
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		} else {
			System.out.println("This code supports K = 1 only.");
			return;
		}
		System.out.println(max);
	}

}
