package com.dp;


import java.util.Scanner;

public class HouseRobber8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read number of houses
        int n = sc.nextInt();

        // Read money in each house
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // If there are no houses
        if (n == 0) {
            System.out.println(0);
            return;
        }

        // If there is only one house
        if (n == 1) {
            System.out.println(nums[0]);
            return;
        }

        // DP array
        int[] dp = new int[n];

        // Base cases
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        // Calculate maximum money
        for (int i = 2; i < n; i++) {

            // Rob current house
            int rob = nums[i] + dp[i - 2];

            // Skip current house
            int skip = dp[i - 1];

            // Choose maximum
            dp[i] = Math.max(rob, skip);
        }

        System.out.println(dp[n - 1]);

        sc.close();
    }
}
