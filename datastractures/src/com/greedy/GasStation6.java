package com.greedy;

public class GasStation6 {

	public static void main(String[] args) {
		int[] gas = { 2, 3, 4, 5, 1 };
		int[] cost = { 3, 4, 1, 2, 2 };

		int totalGas = 0;
		int currentGas = 0;
		int start = 0;

		for (int i = 0; i < gas.length; i++) {
			int diff = gas[i] - cost[i];
			currentGas = currentGas + diff;
			totalGas = totalGas + diff;

			if (currentGas < 0) {
				start = i + 1;
				currentGas = 0;
			}
		}

		if (totalGas < 0) {
			System.out.println(-1);
		} else {
			System.out.println("Starting station index: " + start);
			System.out.println("Starting station number: " + (start + 1));
		}
	}

}
