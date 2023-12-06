 /*
  * 
  How many X's?


  Given two integers L, R, and digit X. Find the number of occurrences of X in all the numbers in the range (L, R) excluding L and R.

Example 1:

Input:
L=10, R=19, X=1
Output:
9
Explanation:
There are 9 1s (11, 12, 13, 14, 15, 16, 17, 18) in the numbers in the range (10,19).
  */



class Solution {
    int countX(int l, int r, int X) {
        // code here
        
        int count =0;
        for(int i = l+1;i<r;i++){
            
            int m = i;
            
            while(m!=0){
                int num = m%10;
                if(num == X) count++;
                m= m/10;
            }
            
        }
        
        return count;
    }
}