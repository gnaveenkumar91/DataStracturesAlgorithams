package com.hashing;

import java.util.HashMap;

public class FirstUniqueueCharacter6 {

	public static void main(String[] args) {
		String str = "abcbacd";
		// frequency
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			map.put(c, map.getOrDefault(c, 0) + 1);

		}
		System.out.println(map);

		// first uniqueue character
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (map.get(c) == 1) {
				System.out.println(c);
              break;
			}
		}

	}

}
