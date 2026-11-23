package com.hashing;

import java.util.HashSet;
//best approach
public class DuplicateElements4 {

	public static void main(String[] args) {
		int[] arr= {10,20,30,20,30,10,40};
		
		HashSet<Integer> set= new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			if(set.contains(num)) {
				System.out.println(num);
			}else {
				set.add(num);
			}
		}

	}

}
