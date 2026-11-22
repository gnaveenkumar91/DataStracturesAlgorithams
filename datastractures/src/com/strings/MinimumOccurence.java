package com.strings;

import java.util.Scanner;

public class MinimumOccurence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String str=sc.nextLine();
		
		int[] arr=new int[127];
		
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)]=arr[str.charAt(i)]+1;
		}
        int min=Integer.MAX_VALUE;
        char c=' ';
        for(int i=0;i<str.length();i++) {
        	if(min>arr[str.charAt(i)]) {
        		min=arr[str.charAt(i)];
        		c=str.charAt(i);
        	}
        }
        
        System.out.println("count evry character");
        for(int i=0;i<str.length();i++) {
        	char ch=str.charAt(i);
        	if(arr[ch]!=0) {
        		System.out.println(ch +"="+arr[ch] );
        	}
        	arr[ch]=0;
        }
        System.out.println("minimun occurence character : " + c);
        System.out.println("minimun occurence : " + min);
	}

}
