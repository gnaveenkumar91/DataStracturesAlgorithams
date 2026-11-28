package com.mock;

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubStringUnique {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		HashSet<Character> set = new HashSet<Character>();
		int left = 0;
		int max = 0;
		for (int right = 0; right < s.length(); right++) {

			char ch = s.charAt(right);

			while (set.contains(ch)) {
				char leftChar = s.charAt(left);
				set.remove(leftChar);
				left++;
			}
			set.add(ch);
			int length = right - left + 1;
			max = Math.max(max, length);
		}
		System.out.println("maximum"+max);
	}

}
