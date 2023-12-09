/*
 * 
 *  remember to revisit the code .. i didnt understand properly..
 * 
 * 
 * Smith Number
 * 
 * 
 * Given a number n, the task is to 
 * find out whether this number is a Smith number or not. 
 * A Smith number is a composite number whose sum of digits is 
 * equal to the sum of digits of its prime factors.

Example 1:

Input:
n = 4
Output:
1
Explanation:
The sum of the digits of 4 is 4, and the sum of the digits of its prime factors is 2 + 2 = 4.


Example 2:

Input:
n = 378
Output:
1
Explanation:
378 = 21*33*71 is a Smith number since 3+7+8 = 2*1+3*3+7*1.




//example 7 


 */


 

class Solution {
     
     
     static int digitSum(int n){
         int sum =0;
         while(n>0){
             
             sum+=n%10;
             n/=10;
             
         }
         return sum;
     }
     
     static int getSum(int n){
         
         int curr = n;
         int sum =0;
         
         for(int i =2;i*i<=n;i++){
             
             while(n%i == 0){
                 sum+=digitSum(i);
                 n/=i;
             }
         }
         
         if(n>1) sum+=digitSum(n);
         
         if( n == curr) return -1;
         
         return sum;
     }

    static int smithNum(int n) {
        int sum1 = digitSum(n);
        int sum2 = getSum(n);
        
        if(sum1 == -1) return 0;
        
        return (sum1 == sum2) ? 1:0;
        
        
            }

}

