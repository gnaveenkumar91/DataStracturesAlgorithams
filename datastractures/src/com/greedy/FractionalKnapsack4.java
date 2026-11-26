package com.greedy;

import java.util.Arrays;

public class FractionalKnapsack4 {
	int weight;
	int value;

	FractionalKnapsack4(int weight, int value) {
		this.weight = weight;
		this.value = value;
	}

	public static void main(String[] args) {

		FractionalKnapsack4[] items = { 
				new FractionalKnapsack4(10, 60),
				new FractionalKnapsack4(20, 100),
				new FractionalKnapsack4(30, 120) };

		Arrays.sort(items, (a, b) -> 
		Double.compare(
				b.value / (double) b.weight, 
				a.value / (double) a.weight));
		
		for (FractionalKnapsack4 item : items) {
			System.out.println("Weight: " + item.weight + ", Value: " + item.value);
			
		}
		
		int capacity=50;
		double totalValue=0;
		for (int i = 0; i < items.length; i++) {
			if (items[i].weight <= capacity) {
				totalValue=totalValue+items[i].value;
				capacity=capacity-items[i].weight;
			}else {
				totalValue=totalValue+(items[i].value/(double)items[i].weight)*capacity;
				break;
			}
		}
		System.out.println("totalValue or maximum value : " + totalValue);
	}
}
