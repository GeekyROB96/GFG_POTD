/*
 * 
 * Decimal Equivalent of binary LL
 * 
 * 
// * Given a singly linked list of length n. The link list represents a binary number, ie- it contains only 0s and 1s. Find its decimal equivalent.
The significance of the bits decreases with the increasing index in the linked list.
An empty linked list is considered to represent the decimal value 0. 

Since the answer can be very large, answer modulo 109+7 should be printed.

Example 1:
Input:
n = 3
Linked List = {0, 1, 1}
Output:
3
Explanation:
0*22 + 1*21 + 1*20 =  1 + 2 + 0 = 3

 */


class Solution
{
   long DecimalValue(Node head)
   {
 	  long MOD = 1000000007;
 	
 	long result =0;
 	
 	while(head!=null){
 	    
 	    result = (result*2 + head.data)%MOD;
 	    head = head.next;
 	}
 	
 	return result;
   }
}