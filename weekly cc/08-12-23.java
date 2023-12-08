
/*
 * 
 * Transform to Prime
 * 
 * 
 * 
 * Given an array of n integers.
 *  Find the minimum non-negative number to be inserted in array, 
 * so that sum of all elements of array becomes prime.
 * 
 * 
 * 
 * Example 1:

Input:
N=5
arr = {2, 4, 6, 8, 12}
Output:  
5
Explanation: 
The sum of the array is 32 ,we can add 5 to this to make it 37 which is a prime number.
 */

 
class Solution
{
    
    public boolean isPrimeno(int num){
        
        for(int i =2;i*i<=num;i++){
            if(num%i == 0) return false;
        }
        return true;
    }
    
    
    public int minNumber(int arr[], int N)
    {
            int temp =0;
            int ans =0;
            
            for(int i =0;i<N;i++){
                temp+=arr[i];
            }
            
            if(temp == 1 ) return 1;
            
            if(isPrimeno(temp)) return ans;
            
            else{
                ans =1;
                temp++;
                while(!isPrimeno(temp)){
                    
                    ans++;
                    temp++;
                }
            }
            return ans;
    }
}
