/*
 * 
 * 
 * Count ways to construct buildings
 * 
 * 
 * There is a road passing through a city with N plots on both sides of the road. Plots are arranged in a straight line on either side of the road. Determine the total number of ways to construct buildings in these plots, ensuring that no two buildings are adjacent to each other. Specifically, buildings on opposite sides of the road cannot be adjacent.

Using * to represent a plot and || for the road, the arrangement for N = 3 can be visualized as follows: * * * || * * *.

Note: As the answer can be very large, print it mod 109+7.

Example 1:

Input: N = 1
Output: 4
Explanation: 
Possible ways for the arrangement are B||*, *||B, B||B, *||*
where B represents a building.
Example 2:

Input: N = 3
Output: 25
Explanation: 
Possible ways for one side are BSS, BSB, SSS, SBS,
SSB where B represents a building and S
represents an empty space. Pairing up with 
possibilities on the other side of the road,
total possible ways are 25.

 */


 class Solution
{
    private  long MOD = 1000000007;

    public int TotalWays(int N)
    {
        // Code here
        long  a= 1, b=1,c=0;
        //fibonacci in 0(1) space
        for(int i =0;i<N;i++){
            
            c = (a%MOD+b%MOD)%MOD;
             a = b%MOD;
             b = c%MOD;
        }
        
        return (int)((c*c)%MOD);
    }

}