
/*
 * 
 * Max Sum Subarray of size k
 * 
 * Given an array of integers Arr of size N and a number K.
 *  Return the maximum sum of a subarray of size K.

NOTE*: A subarray is a contiguous part of any given array.

Example 1:

Input:
N = 4, K = 2
Arr = [100, 200, 300, 400]
Output:
700
Explanation:
Arr3  + Arr4 =700,
which is maximum.




Example 2:

Input:
N = 4, K = 4
Arr = [100, 200, 300, 400]
Output:
1000
Explanation:
Arr1 + Arr2 + Arr3 + Arr4 =1000,
which is maximum.
 */

import java.util.*;

 class Solution{
    
    static long maximumSumSubarray(int k, ArrayList<Integer> Arr,int N){
        // code here
        long maxsum =Integer.MIN_VALUE;
        long sum = 0;
        
        for(int i =0;i<k;i++){
            sum += Arr.get(i);
        }
        
        maxsum = Math.max(sum,maxsum);
        int j =0;
        for(int i =k;i<N;i++){
            sum -=Arr.get(j++);
            sum+= Arr.get(i);
            maxsum = Math.max(sum,maxsum);
            
        }
        
        return maxsum;  
    }
}