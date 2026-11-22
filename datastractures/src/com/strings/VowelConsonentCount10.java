package com.strings;

import java.util.Scanner;

public class VowelConsonentCount10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string : ");
		String str = sc.nextLine();

		str = str.toLowerCase();
		char[] ach = str.toCharArray();

		int vowel = 0;
		int consonant = 0;

		for (char c : ach) {
			if (c >= 'a' && c <= 'z') {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowel++;
				} else {
					consonant++;
				}
			} else {

			}
		}

		System.out.println("vowels count : " + vowel);
		System.out.println("consonants counts : " + consonant);

	}

}
