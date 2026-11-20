package com.arrays;

public class twoarraycombine3 {

	public static void main(String[] args) {
          int[] a1= {10,20,30};
          int a1Length=a1.length;
          
          
          int[] a2= {40,50,60};
          int a2Length=a1.length;
          
          int[] a3= new int[a1Length+a2Length];
          for(int i=0;i<a1.length;i++) {
        	  a3[i]=a1[i];
          }
          for(int i=0;i<a2.length;i++) {
        	  a3[a1Length+i]=a2[i];
          }
          for(int i=0;i<a3.length;i++) {
        	  System.out.print(a3[i]+" ");
          }
	}

}
