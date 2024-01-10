/*
 * 
 * Given an array arr containing N integers and a positive integer K, find the length of the longest sub array with sum of the elements divisible by the given value K.

Example 1:

Input:
N = 6, K = 3
arr[] = {2, 7, 6, 1, 4, 5}
Output: 
4
Explanation:
The subarray is {7, 6, 1, 4} with sum 18, which is divisible by 3.
 */

 
class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        // Complete the function
        HashMap<Integer,Integer> map = new HashMap<>();
        
        
        int count =0; 
        int max = 0;
        
        map.put(0,-1);
        
        for(int i =0;i<n;i++){
            
            count+=a[i];
            int rem = count%k;
            
            if(rem<0) rem+= k;
            
            if(map.containsKey(rem))  max = Math.max(max,i-map.get(rem));
            
            if(!map.containsKey(rem)) map.put(rem,i);
        }
        
        return max;
       
    }
 
}