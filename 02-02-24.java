/*
 * Implement a to i
 * Given a string, s, the objective is to convert it into integer format without utilizing any built-in functions. If the conversion is not feasible, the function should return -1.

Note: Conversion is feasible only if all characters in the string are numeric or if its first character is '-' and rest are numeric.

Example 1:

Input:
s = "-123"
Output: 
-123
Explanation:
It is possible to convert -123 into an integer 
and is so returned in the form of an integer
 */


/*You are required to complete this method */
class Solution
{
    int atoi(String s) {
	// Your code here
	int minus =1;
	int idx = 0;
	if(s.charAt(0)=='-'){
	    minus = -1;
	    idx++;
	} 
	
	int num =0;
    	for(int i=idx;i<s.length();i++){
	    
	        char c = s.charAt(i);
	        
	        if(c>='0' && c<='9'){
	            num = num*10 + c-'0';
	        }else return -1;
	    }
	    
	    return minus*num;
    }
}
