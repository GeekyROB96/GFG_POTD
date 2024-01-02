/*
 * 
 * Largest Sum Subarray of Size at least K
Given an array a of length n and a number k, find the largest sum of the subarray containing at least k numbers. It is guaranteed that the size of array is at-least k.

Example 1:

Input : 
n = 4
a[] = {1, -2, 2, -3}
k = 2
Output : 
1
Explanation :
The sub-array of length at-least 2
that produces greatest sum is {1, -2, 2}
 */


 
class Solution {
    
    public long maxSumWithK(long a[], long n, long k)
    { //Largest Sum Subarray of Size at least K

        
        long sum =0;
        for(int i =0;i<k;i++){
            sum+=a[i];
        }
        if(n==k ) return sum;
        
        long prev=0;
        long max =sum;
        for(int i= (int)k;i<n;i++){
            sum+=a[i];
            sum -=a[i-(int)k];
            prev +=a[i-(int)k];
            if(prev>0) max = Math.max(sum+prev,max);
            else{
                max = Math.max(max,sum);
                prev =0;
            }
        }
        return max;
    }
}