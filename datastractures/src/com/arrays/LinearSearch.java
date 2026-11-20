package com.arrays;

import java.util.Scanner;

public class LinearSearch {
        static int search(int[] arr,int key) {
        	for(int i=0;i<arr.length;i++) {
        	if(arr[i]==key) {
        		return i;
        	}
        		}
        	return -1;
        }
	public static void main(String[] args) {
		int[] arr= {10,20,8,65,7,8};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter key");
		int key=sc.nextInt();
		
        
        System.out.println("key index : " + search( arr, key));
        sc.close();
	}

}
