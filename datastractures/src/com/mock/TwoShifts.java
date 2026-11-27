package com.mock;

import java.util.Scanner;

public class TwoShifts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int shiftA = 0;
		int shiftB = 0;

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				shiftA = shiftA+arr[i];
			} else {
				shiftB = shiftB+arr[i];
			}
		}
		int Difference1 = shiftA - shiftB;

		int Difference2 = shiftB - shiftA;
		int min = Math.min(Difference1, Difference2);
		System.out.println(min);
	}

}
