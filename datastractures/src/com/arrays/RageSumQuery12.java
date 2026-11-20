package com.arrays;

public class RageSumQuery12 {

	public static void main(String[] args) {
		int[] arr= {5,10,20,50,100};//5 15 35 85 185 
        int[] prefix=new int[arr.length];
        
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++) {
        	prefix[i]=prefix[i-1]+arr[i];
        }
        
        for(int p:prefix) {
        	System.out.print(p+ " ");
        }
        
        int l=1;
        int r=3;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter starting index:");
//        int l = sc.nextInt();
//
//        System.out.println("Enter ending index:");
//        int r = sc.nextInt();

        int sum=0;
        if(l==0) {
        	sum=prefix[r];
        }else {
        	sum=prefix[r]-prefix[l-1];
        }
        System.out.println();
        System.out.print( "range sum : "+ sum);
	}

}
