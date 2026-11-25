package com.greedy;

public class JumpGame3 {

	public static void main(String[] args) {
		int[] num= {2,1,1,1,4};
		int farthest=0;
		 boolean canReach = true;
		for(int i=0;i<num.length;i++) {
			 if(i>farthest) {
				 canReach = false;
	                break;
			 }
			 farthest=Math.max(farthest, i+num[i]);
		}
		System.out.println(canReach);

	}

}
