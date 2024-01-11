/*

Remove K digits
 * 
 * Given a non-negative integer S represented as a string, remove K digits from the number so that the new number is the smallest possible.
Note : The given num does not contain any leading zero.

Example 1:

Input:
S = "149811", K = 3
Output: 
111
Explanation: 
Remove the three digits 
4, 9, and 8 to form the new number 111
which is smallest.
 */



 class Solution {
    public String removeKdigits(String S, int k) {
        // code here
        Stack<Character> st = new Stack<>();
        int n = S.length();
        for(int i =0;i< n ;i++){
            
            char c = S.charAt(i);
            
            while(!st.isEmpty() && st.peek()> c && k>0){
                
                st.pop();
                k--;
            }
            
            if(!st.isEmpty() || c!='0'){
                st.push(c);
            }
        }
        
        
        
        //case 10029911
        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
        }
        
        if(st.isEmpty()) return "0";
        
        
        StringBuilder sb = new StringBuilder();
        
        for(Character ch : st){
            sb.append(ch);
        }
        return sb.toString();
    }
}