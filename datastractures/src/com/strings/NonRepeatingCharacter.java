package com.strings;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		String str = "aabbcde";

		int[] arr = new int[256];

		// Step 1: Count frequency
		for (int i = 0; i < str.length(); i++) {
		    char ch = str.charAt(i);
		    arr[ch]++;
		    
		}
		
  
		// Step 2: Find first non-repeating character
		for (int i = 0; i < str.length(); i++) {
		    char ch = str.charAt(i);

		    if (arr[ch] == 1) {
		        System.out.println(ch);
		        break;
		    }
		}

	}

}
