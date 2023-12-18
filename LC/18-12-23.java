
/*
 * 
 * 
 * Game of XOR
 * 
 * 
 * Given an array A of size N. The value of an array is denoted by the bit-wise XOR of all elements it contains. Find the bit-wise XOR of the values of all subarrays of A.

Example 1:

Input: 
N = 3 
A = [1,2,3] 
Output: 
2
Explanation:
xor[1] = 1
xor[1, 2] = 3
xor[2, 3] = 1
xor[1, 2, 3] = 0
xor[2] = 2
xor[3] = 3
Result : 1 ^ 3 ^ 1 ^ 0 ^ 2 ^ 3 = 2

 */


 
class Solution {
    static int gameOfXor(int N , int[] A) {
        // code here
        int ans =0;
        
        for(int i =0;i<N;i++){
            int freq = (i+1)*(N-i);
            if((freq&1) == 1 ) ans = ans^A[i];
        }
        
        return ans;
    }
}

///observation was to count occurence of each element in array and if its even then XOR will be 0 because a^a =0
// a = 1,2,3,4,5 

// freq 
// 1 = 5 == 1*n
// 2 =8 == 2*(n-1)
// 3 =9 == 3*(n-2)
// 4 = 8 == 4*(n-3)
// 5 = 5 == 5*(n-4)

// i == (i+1)*(n-i)

