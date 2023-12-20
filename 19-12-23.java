
// Rightmost different bit
/*
 * 
 * Given two numbers M and N. The task is to find the position of the rightmost different bit in the binary representation of numbers.
 *  If both M and N are the same then return -1 in this case.


 */

 class Solution
{
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
            int count =1;
            int p = m^n;
        while(p>0){
            if((p&1) == 1) return count;
            
            count++;
            p=p>>1;
        }   
            
            return -1;
    }
}
