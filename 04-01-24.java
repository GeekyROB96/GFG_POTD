/*
 * 
 * Given an array of integers arr[] of length N, every element appears thrice except for one which occurs once.
Find that element which occurs once.

Example 1:

Input:
N = 4
arr[] = {1, 10, 1, 1}
Output:
10
Explanation:
10 occurs once in the array while the other
element 1 occurs thrice.
 */


 class Solution {
    static int singleElement(int[] arr , int N) {
        // code here
        
       int result =0;
       
       for(int i =0;i<32;i++){
           
           int ans =0;
           for(int j=0;j<N;j++){
               
           
               if((arr[j] & (1<<i))!=0)      ans++;
               
                
           }
           if(ans%3 == 1) result+= 1<<i;
       }
       return result;
    }
}