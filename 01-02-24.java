/*
 * 
 * Given a string s check if it is "Panagram" or not.

A "Panagram" is a sentence containing every letter in the English Alphabet.

Example 1:

Input:
s = "Bawds jog, flick quartz, vex nymph"
Output: 
1
 */


 class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
        // your code here
        
       int[] a = new int[26]; 
       
       
       for(int i =0;i<s.length();i++){
           char c = Character.toLowerCase(s.charAt(i));
           if(c-'a'>=0 && c- 'a' <=26){
               a[c-'a']++;
           }
       }
       
       
       for(int i =0;i<a.length;i++){
           if(a[i] == 0) return false;
       }
       
       return true;
    }
}