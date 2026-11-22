package com.strings;

import java.util.Scanner;

public class ReverseStringways9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.next();
		System.out.println("------------------stringbuilder_____________");
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
		
		
		System.out.println("++++++++++++++++ for loop++++++++++");
		
		String rstr="";
		for(int i=0;i<str.length();i++) {
			char s1=str.charAt(i);
			rstr=s1+rstr;
			
		}
		System.out.println(rstr);
		
		System.out.println("-----------StringBuffer--------------");
		
		StringBuffer sb1 = new StringBuffer(str);
		System.out.println(sb1.reverse());
		
		
		
	      System.out.println("__________________using char arraypointer________________________________");  

		//(Two-Pointer Approach)
		char[] c=str.toCharArray();
		int left=0;
		int right=c.length-1;
		
		
		while(left<right) {
			char temp=c[left];
			c[left]=c[right];
			c[right]=temp;
			
			left++;
			right--;
			
		}
		String reversed = new String(c);

		System.out.println("reverse arr : " + reversed);

		// Step 2: compare
		if (str.equals(reversed)) {
		    System.out.println("Palindrome");
		} else {
		    System.out.println("Not Palindrome");
		}
		
		  System.out.println("__________________using bytes array 2 pointer________________________________");  
		
				byte[] b=str.getBytes();
				int left1=0;
				int right1=c.length-1;
				
				while(left1<right1) {
					byte temp=b[left1];
					b[left1]=b[right1];
					b[right1]=temp;
					left1++;
					right1--;
					
				}
				String reverse = new String(b);
				System.out.println(reverse);
				
		
		
       sc.next();


	}

}
