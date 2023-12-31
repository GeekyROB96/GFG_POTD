/*
 * 
 * NEW YEAR RESOLUTION
 * 
 * 
 * As the clock struck midnight on New Year's Eve, Geek bid farewell to the wasted moments of 2023, realizing the untapped potential of GFG's Problem of the Day.

His 2024 resolution: Solve POTD every day.

Eager to earn coins for GFG Merchandise, Geek faces new rules:

Earning Coin: Geek can accumulate coins[i] by solving the POTD on the ith day, where 1 <= coins[i] <= 2024 and the sum of coins <= 2024.
Merchandise Eligibility: To purchase merchandise, the coins earned must be divisible by 20 or 24, or precisely equal to 2024.
Geek's resolutions often fades over time. Realistically, he can only commit to active participation for N (where N ≤ 366) days. Given the value of N and number of coins associated with each POTD, can Geek strategically solve some (or all) POTDs to become eligible for redeeming merchandise?

Example 1:

Input:
N = 8
coins = [5, 8, 9, 10, 14, 2, 3, 5]

Output: 1

Explanation:
Geek can fulfill the criteria in many ways.
One such way is to solve POTD on 4th and 5th day.
Another way is to solve POTD on 1st, 4th and 8th day
 */

 class Solution {
    public static boolean isPossible(int n, int[] coins) {
        // code here
        
        return util(0,coins,n,0);
    }
    
    public static boolean util(int idx, int[] coins, int n, int sum){
        
        if(sum!=0 && (sum%2024==0|| sum%20==0||sum%24==0)) return true;
        
        
        if(idx == coins.length) return false;
        
        
        boolean ans1= util(idx+1,coins,n,sum+coins[idx]);
        if(ans1==true) return true;
        
        boolean ans2 = util(idx+1,coins,n,sum);
        if(ans2== true) return true;
        
        
        return false;
    }
}
        