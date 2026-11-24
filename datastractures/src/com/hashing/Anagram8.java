package com.hashing;

import java.util.HashMap;

public class Anagram8 {

	public static boolean isAnagram(String s, String t) {

		if (s.length() != t.length()) {
			return false;
		}

		HashMap<Character, Integer> map = new HashMap<>();

		// Count characters in first string
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		// Decrease frequencies using second string
		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);

			if (!map.containsKey(ch) || map.get(ch) == 0) {
				return false;
			}

			map.put(ch, map.get(ch) - 1);
		}

		return true;
	}

	public static void main(String[] args) {
		boolean result = isAnagram("anagram", "nagaram");

		System.out.println(result);
	}

}
