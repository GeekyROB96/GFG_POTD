
/*
 * Count more than n/k occurences
 * 
 * 
 * Given an array arr of size N and an element k. The task is to find the count of elements in the array that appear more than n/k times.

Example 1:

Input:
N = 8
arr = [3,1,2,2,1,2,3,3]
k = 4
Output: 
2
Explanation: 
In the given array, 3 and 2 are the only elements that appears more than n/k times.
 */

import java.util.Arrays;

class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
         Arrays.sort(arr);
        int m = n/k;
        int temp = arr[0];
        int count=0;
        int e=0;
        for(int i=0;i<n;i++){
            if(arr[i]==temp){
                count++;
            }else{
                if(count>m){
                    e++;
                }
                count = 1;
                temp = arr[i];
            }
        }
        if(count>m){
            e++;
        }
        return e;
    }
}
