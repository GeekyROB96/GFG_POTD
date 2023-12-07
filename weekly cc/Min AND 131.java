package weekly cc;
 

/*
 * 
 * MIN AND
 * 
 * 
 * 
 * You are given two integers, a and b. Find the minimum value of the
expression a&x+ b&x, for 1 <= x <= max(a, b).
Note: &represents the bitwise AND operator.


Input: a =4, b =2
Output: 0
Explanation:
Take x = 2
the value of the expression

4&2 +5&2 =0 +0 =0
 */


 class Solution {
      public long solve(long a, long b) {
        long ans = Long.MAX_VALUE;
        
        long max = Math.max(a,b);
        
        for(long i=1;i<=max;i<<=1){
            
            ans = Math.min(ans, (a&i)+(b&i));
        }
        return ans;
      }
}

