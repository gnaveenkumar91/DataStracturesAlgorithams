package com.greedy;

import java.util.Arrays;

public class MaximumUnitsOfTrack5 {

	public static void main(String[] args) {
		int[][] boxTypes = { { 3, 4 }, { 2, 3 }, { 4, 1 } };

		int truckSize = 4;
         
		int maxValue=0;
		Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));

//		for(int[] box:boxTypes) {
//			for(int b:box) {
//				System.out.print(b + " ");
//			}
//			System.out.println();
//		}
		for (int i = 0; i < boxTypes.length; i++) {
               
			int boxes=Math.min(boxTypes[i][0],truckSize);
			
			int units=boxes*boxTypes[i][1];
			 
			maxValue=maxValue+units;
			
			truckSize=truckSize-boxes;
			
			if(truckSize==0) {
				break;
			}
			
		}
  System.out.println("Mximum units are :" + maxValue);
	}

}
