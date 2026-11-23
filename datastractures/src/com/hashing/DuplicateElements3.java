package com.hashing;

import java.util.HashMap;

public class DuplicateElements3 {

	public static void main(String args[]) {

		int[] arr = { 10, 20, 10, 30, 20 };

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
             int num=arr[i];
             
            map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		System.out.println(map);
		
		for(int n:map.keySet()) {
			if(map.get(n)>1) {
				System.out.println(n);
			}
		}

	}

}
