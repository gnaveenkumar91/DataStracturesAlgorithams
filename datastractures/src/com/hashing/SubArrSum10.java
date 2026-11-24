package com.hashing;

import java.util.HashMap;

//using hashing
public class SubArrSum10 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		int k = 3;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 1);
		int count = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			int required = sum - k;

			if (map.containsKey(required)) {

				count = count + map.get(required);
			}
			map.put(sum, map.getOrDefault(sum, 0) + 1);

		}
		System.out.println(count);

	}

}
