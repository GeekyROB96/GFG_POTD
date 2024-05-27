/*
 * 
 * Given an integer array a[] of size n, find the length of the longest subsequence such that the absolute difference between adjacent elements is 1.

Example 1:

Input:
n = 7
a[] = {10, 9, 4, 5, 4, 8, 6}
Output: 
3
Explaination: 
The three possible subsequences of length 3 are {10, 9, 8}, {4, 5, 4}, and {4, 5, 6}, where adjacent elements have a absolute difference of 1. No valid subsequence of greater length could be formed.
 */


 
class Solution {
    public static int longestSubseq(int n, int[] a) {
        // code here
        
        return solve(a,0,-1);        
    }
    
    public static int solve(int[] arr,int idx, int prev){
        
            if(idx == arr.length)  return 0;
            
            int take =0, nottake =0;
            
            if((arr[idx] - prev == 1 || arr[idx] - prev == -1)  || prev == -1){
                
                take = 1 + solve(arr,idx+1,arr[idx]);
            }
            
            nottake = solve(arr,idx+1,prev);
            
            return Math.max(take,nottake);
    }
}