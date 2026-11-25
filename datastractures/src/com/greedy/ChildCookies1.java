package com.greedy;

public class ChildCookies1 {

	public static void main(String[] args) {
		int[] child= {1,2,3,4};
		int[]  cookies= {1,2,4};
		int count=0;
		int i=0;
		int j=0;
		while(i<child.length && j<cookies.length) {
			if(cookies[j]>=child[i] ){
				i++;
				j++;
				count++;
			}else {
				j++;
			}
		}
		System.out.println("maximum num of count : " + count);

	}

}
