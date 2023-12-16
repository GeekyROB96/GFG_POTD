/*
 * 
 * String Count
 * 
 * 
 * Given a length n, count the number of strings of length n that can be made using a, b and c with at-most one b and two c allowed.

Example 1:

Input: n = 1
Output: 3
Explanation: Possible strings are: "a",
"b" and "c"
Example 2:

Input: n = 3
Output: 19
Explanation: Number of strings with 3 
occurrances of a: 1
2-a and 1-b: 3
2-a and 1-c: 3
1-a, 1-b and 1-c: 6
1-a and 2-c: 3
1-b and 2-c: 3
So, total number of strings of length 3
is 1 + 3 + 3 + 6 + 3 + 3 = 19

 */




 class Solution 
{ 
    static long countStr(long n)
	{
	    // code here
	    long c1 =1; //all a
	    long c2 = n; //1 b
	    long c3 = n; // 1 c
	    long c4 = n*(n-1);  //1b 1c
	    long c5 = n*(n-1)*(n-2); //1b 2c
	    c5 = c5/2;
	    long c6 = n*(n-1)/2; //2c
	    
	    return (c1+c2+c4+c3+c5+c6);
	}
} 