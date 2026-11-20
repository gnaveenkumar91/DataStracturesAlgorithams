package com.arrays;

public class MinMax1 {

	public static void main(String[] args) {
		int[] num = { 10, 20, 30, 40, 12, 9 };
		int min = num[0];
		int max = num[0];
		
		for (int i = 0; i < num.length; i++) {
           if(num[i]<min) {
        	   min=num[i];
           } if(num[i]>max) {
        	   max=num[i];
           }
          
		}
		 System.out.println("Min"+min);
         System.out.println("Max"+max);
        
	}

}
