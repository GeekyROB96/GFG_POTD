/*
 *            \   /
 * CANDY MAN   0 0
                -
                
                
There are N children standing in a line. Each child is assigned a rating value given in the integer array ratings.
You are giving candies to these children subjected to the following requirements:

Each child must have atleast one candy.
Children with a higher rating than its neighbors get more candies than their neighbors.
Return the minimum number of candies you need to have to distribute.

Example 1:

Input:
N = 3
ratings = [1, 0, 2]
Output: 
5
Explanation: 
You can allocate to the first, second and third child with 2, 1, 2 candies respectively.
Example 2:

Input:
N = 3
ratings = [1, 2, 2]
Output: 
4
Explanation: 
You can allocate to the first, second and third child with 1, 2, 1 candies respectively.
The third child gets 1 candy because it statisfies the above two conditions.
 */

import java.util.*;
 class Solution {
    static int minCandy(int N, int ratings[]) {
        
        int[] candy = new int[N];
        Arrays.fill(candy,1);
        
        int count =0;
        
        for(int i =1 ;i<N;i++){
            if(ratings[i]>ratings[i-1]) candy[i] = candy[i-1]+1;
        }
        
        
        for(int i =N-2;i>=0;i--){
            if(ratings[i]>ratings[i+1])  candy[i] = Math.max(candy[i+1]+1,candy[i]);
        }
        
        for(int val:candy) count+=val;
        
        return count;
    }
}
