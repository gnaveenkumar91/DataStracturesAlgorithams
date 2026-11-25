package com.greedy;

import java.util.Arrays;

public class NonOverlapping2 {

	public static void main(String[] args) {
		int[][] intervals = new int[][]{{1, 2}, {1, 3}, {3, 4}, {1, 3}};
		
		Arrays.sort(intervals,(a,b)->Integer.compare(a[1], b[1]));
	  
       int count=0;
       int prevEnd = intervals[0][1];//2
       for(int i=1;i<intervals.length;i++) {
    	   if(intervals[i][0]>=prevEnd) {
    		   prevEnd=intervals[i][1];
    	   }else {
    		   count++;
    	   }
       }
       System.out.println(count);
	}

}
