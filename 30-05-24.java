/*
 * 
 * 
 * Given two strings, s1 and s2, count the number of subsequences of string s1 equal to string s2.

Return the total count modulo 1e9+7.

Example 1:

Input: 
s1 = geeksforgeeks
s2 = gks
Output:
4
Explaination: 
We can pick characters from s1 as a subsequence from indices {0,3,4}, {0,3,12}, {0,11,12} and {8,11,12}.So total 4 subsequences of s1 that are equal to s2.

 */


 class Solution {
    
    static int MOD  = 1000000007; // corrected the MOD value
    
    public static int countWays(String s1, String s2) {
        // Initialize the dp array with -1 indicating uncomputed states
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(s1, s2, 0, 0, dp);
    }
    
    public static int solve(String s1, String s2, int i, int j, int[][] dp) {
        
        // If we have matched all characters of s2
        if (j == s2.length()) return 1;
        
        // If we have reached the end of s1 and not all characters of s2 are matched
        if (i == s1.length()) return 0;
        
        // Check if the result is already computed
        if (dp[i][j] != -1) return dp[i][j];
        
        long count = 0; // Use long for intermediate results
        
        // If the current characters match
        if (s1.charAt(i) == s2.charAt(j)) {
            count = (solve(s1, s2, i + 1, j + 1, dp) + solve(s1, s2, i + 1, j, dp)) % MOD;
        } else {
            // If the characters do not match
            count = solve(s1, s2, i + 1, j, dp) % MOD;
        }
        
        // Store the result in the dp array and return it
        dp[i][j] = (int)count;
        return dp[i][j];
    }
}

