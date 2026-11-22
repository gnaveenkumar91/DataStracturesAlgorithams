package com.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();

		System.out.println("Enter a String");
		String str1 = sc.nextLine();
		
		str=str.replaceAll("\\s+", "").toLowerCase();
		str1=str1.replaceAll("\\s+", "").toLowerCase();
		
		
		if(isAnagram(str,str1)) {
			System.out.println("Both are anagrams");
		}else {
			System.out.println("both are not anagrams");
		}

	}

	private static boolean isAnagram(String str, String str1) {
	      if(str.length()!=str1.length()) {
	    	return false;
	      }
	      
	    char[] c1=str.toCharArray();
	    char[] c2=str1.toCharArray();
	    
	    Arrays.sort(c1);
	    Arrays.sort(c2);
	   
		return Arrays.equals(c1, c2);
	}

}
