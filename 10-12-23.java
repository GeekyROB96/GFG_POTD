
/*
 * 
 * Subarray of 0 sum
 * 
 * 
 * Given an array of integers. 
 * Find if there is a subarray (of size at-least one) with 0 sum. 
 * You just need to return true/false depending upon whether 
 * there is a subarray present with 0-sum or not.
 *  Printing will be taken care by the driver code.



 Example 1:

Input:
n = 5
arr = {4,2,-3,1,6}
Output: 
Yes
Explanation: 
2, -3, 1 is the subarray with sum 0



Example 2:

Input:
n = 5
arr = {4,2,0,1,6}
Output: 
Yes
Explanation: 
0 is one of the element in the array so there exist a subarray with sum 0.

 */



import java.util.*;
 
class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        
        HashMap<Integer,Boolean> map = new HashMap<>();
        
        int sum =0;
        map.put(sum,true);

        for(int val:arr){
            
            sum+=val;
            
            if(map.containsKey(sum)) return true;
            
            else map.put(sum,true);
        }
        
        return false;

    }
}