/*
 * 
 * Implement pow(x, n) % M.
In other words, for a given value of x, n, and M, find  (xn) % M.
 

Example 1:

Input:
x = 3, n = 2, m = 4
Output:
1
Explanation:
32 = 9. 9 % 4 = 1.
 */

public class 20-05-24 {

    public long PowMod(long x, long n, long m)
    {
        // Code here
        long res =1;
        x = x%m;
        while(n>0){
            
            if(n%2==1) res = (res*x)%m;
            
            x = (x*x)%m;
            n/=2;
        }
        
        return res;
    }
    
}
