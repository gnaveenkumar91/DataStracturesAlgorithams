package com.strings;

import java.util.Arrays;

public class Anagram3 {

	public static void main(String[] args) {
	  
		String str="race";
		String str1="anre";
		 
		     char[] c1=str.toCharArray();
		     char[] c2=str1.toCharArray();
		
		if(str.length()!=str1.length()) {
			System.out.println("it is not nagram");
			 return;
		}
		 
	   Arrays.sort(c1);
       Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2)) {
			System.out.println("anagram");
		}else {
			System.out.println("not anagrams");
		}

	}

}
