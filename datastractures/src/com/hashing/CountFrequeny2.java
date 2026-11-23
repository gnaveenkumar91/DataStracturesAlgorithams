package com.hashing;

import java.util.HashMap;

public class CountFrequeny2 {

	public static void main(String[] args) {
		int[] arr= {10,20,10,30,20,10};
		
		HashMap<Integer,Integer> map= new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			map.put(num, map.getOrDefault(num, 0)+1);
		}
        System.out.println(map);
	}

}
