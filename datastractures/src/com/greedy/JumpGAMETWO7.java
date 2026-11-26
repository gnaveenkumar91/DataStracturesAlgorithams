package com.greedy;

public class JumpGAMETWO7 {

	public static void main(String[] args) {
		int[] nums = {2, 3, 1, 1, 4};
		int current=0;
		int farthest=0;
		int jump=0;
		for(int i=0;i<nums.length-1;i++) {
			farthest=Math.max(farthest, i+nums[i]);
			
			if(i==current) {
				jump++;
				current=farthest;
			}
			
		}
		System.out.println("num of minimum jumps : " +jump);

	}

}
