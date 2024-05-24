

//Partitions with Given Difference


class Solution {
    
    private static final int MOD = 1000000007;

 public static int countPartitions(int n, int d, int[] arr) {
     int totalSum = 0;
     for (int num : arr) {
         totalSum += num;
     }

     // Check if (sum - d) is non-negative and even
     if (totalSum < d || (totalSum - d) % 2 != 0) {
         return 0;
     }

     int targetSum = (totalSum - d) / 2;
     Integer[][] dp = new Integer[n + 1][targetSum + 1];
     for (Integer[] row : dp) {
         Arrays.fill(row, -1);
     }

     return solve(arr, n, targetSum, dp);
 }

 private static int solve(int[] arr, int i, int target, Integer[][] dp) {
     if (i == 0) {
         return target == 0 ? 1 : 0;
     }

     if (dp[i][target] != -1) {
         return dp[i][target];
     }

     dp[i][target] = solve(arr, i - 1, target, dp) % MOD;

     if (arr[i - 1] <= target) {
         dp[i][target] = (dp[i][target] + solve(arr, i - 1, target - arr[i - 1], dp)) % MOD;
     }

     return dp[i][target];
 }
 
}