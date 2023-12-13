/*
 * 
 * Consecutive one's not allowed
 * 
 * 
 * 
 * Given a positive integer N,
 *  count all possible distinct binary strings of length N such that 
 * there are no consecutive 1’s.
 * Output your answer modulo 109 + 7.

Example 1:

Input:
N = 3
Output: 5
Explanation:
5 strings are (000,
001, 010, 100, 101).

Example 2:

Input:
N = 2
Output: 3
Explanation: 
3 strings are (00,01,10).





explaination

n= 1
strings "0" , "1"

zero = 1, ones =1, total = zero+ones





n =2 
strings "00"  "01"  "10"  

zeroes = 2 , ones =1

ones = zeroes, 
zero = total
total = zeroes + ones

"11" not possible .

so for current no if we have trailing zero for prev no .. than that 
can have both 0 and 1s


 */


 class Solution {
    long countStrings(int n) {
        // code here
        if(n==1) return 2;
        
        long one = 1 ;
        long zero =1 ;
        long total = (one + zero);
        long mod  = 1000000007;
        while(n>1){
            n = n-1;
            one = zero;
            zero = total;
            
            total = (one+zero)%mod;
        }
        
        return total%mod;
    }
}