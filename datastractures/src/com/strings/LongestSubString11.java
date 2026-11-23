package com.strings;

public class LongestSubString11 {

	public static void main(String[] args) {
	   String s="abcabcbb";
	   int left=0;
	   int max=0;
	   int[] arr=new int[256];
	   
	  for(int right=0;right<s.length();right++) {
		 char ch= s.charAt(right);
		 
		 arr[ch]++;
		
		 
		 while(arr[ch]>1) {
			 char leftChar=s.charAt(left);
			 arr[leftChar]--;
			 
			 left++;
		 }
		 int length=right-left+1;
		 
		 if(length>max) {
			 max=length;
		 }
		
	  }
	  System.out.println("longest sub string legth : " +max);
	}

}
