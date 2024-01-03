
/*

Smallest window containing 0, 1 and 2


 * Given a string S consisting of the characters 0, 1 and 2. Your task is to find the length of the smallest substring of string S that contains all the three characters 0, 1 and 2. If no such substring exists, then return -1.

Example 1:

Input:
S = 10212
Output:
3
Explanation:
The substring 102 is the smallest substring
that contains the characters 0, 1 and 2.
 */


 
class Solution {
    public int smallestSubstring(String S) {
        // Code here
        int len=Integer.MAX_VALUE;
        int zeroi =-1,onei =-1,twoi =-1;
        for(int i=0;i<S.length();i++){
            
            if(S.charAt(i) == '0')  zeroi =i;
            else if(S.charAt(i) == '1') onei =i;
            else twoi =i;
            
            if(zeroi !=-1 && onei!=-1 && twoi!=-1){
                int x = Math.min(zeroi,Math.min(onei,twoi));
                len = Math.min(len,(i-x)+1 );
            }
            
        }
        
        return (len != Integer.MAX_VALUE)? len: -1;
            
            
        
    }
};
