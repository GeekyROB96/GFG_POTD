/*
 * 
 * Gold Mine Problem
 * 
 * 
 * 
 * Given a gold mine called M of (n x m) dimensions. Each field in this mine contains
 *  a positive integer which is the amount of gold in tons.
 *  Initially the miner can start from any row in the first column.
 *  From a given cell, the miner can move

to the cell diagonally up towards the right 
to the right
to the cell diagonally down towards the right
Find out maximum amount of gold which he can collect until he can no longer move.

Example 1:

Input: n = 3, m = 3
M = {{1, 3, 3},
     {2, 1, 4},
     {0, 6, 4}};
Output: 12
Explaination: 
The path is {(1,0) -> (2,1) -> (2,2)}.

Example 2:

Input: n = 4, m = 4
M = {{1, 3, 1, 5},
     {2, 2, 4, 1},
     {5, 0, 2, 3},
     {0, 6, 1, 2}};
Output: 16
Explaination: 
The path is {(2,0) -> (3,1) -> (2,2) 
-> (2,3)} or {(2,0) -> (1,1) -> (1,2) 
-> (0,3)}.
 */


 
class Solution{
    static int maxGold(int n, int m, int M[][])
    {
        // code here
         int ans = 0;
        
        for(int j =m-2;j>=0;j--){// we take j = m-2 because if we are at last index isvalid fn is checking for next diagonal condition not for current
                                // thats why we need to take j = m-2 to avoid illegal access to  array memory 
            
            for(int i =0;i<n;i++){
                
                int max = Integer.MIN_VALUE;
                //diagonal up
                if(isValid(i-1,j+1,n,m)) max = Math.max(M[i-1][j+1],max);
                
                //diagonal right
                
                if(isValid(i+1,j+1,n,m)) max = Math.max(M[i+1][j+1],max);
                
                //right
                
                if(isValid(i,j+1,n,m)) max =  Math.max(M[i][j+1],max);
                
                M[i][j] +=max;
                
            }
            
           
            
            for(int i=0;i<n;i++)  ans = Math.max(ans,M[i][0]);
        }
        
        return ans;
    }
    
    public static boolean isValid(int i,int j,int n,int m){
        if( i<0 || j<0 || i>=n || j>= m) return false;
        
        return true;
        
    }
}