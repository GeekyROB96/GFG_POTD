/*
 * 
 * KMP ALGORITHM (SEARCH PATTERN)
 * 
 * Given two strings, one is a text string, txt and other is a pattern string, pat. The task is to print the indexes of all the occurences of pattern string in the text string. Use one-based indexing while returing the indices. 
Note: Return an empty list incase of no occurences of pattern. Driver will print -1 in this case.

Example 1:

Input:
txt = "geeksforgeeks"
pat = "geek"
Output: 
1 9
Explanation: 
The string "geek" occurs twice in txt, one starts are index 1 and the other at index 9. 
 */
import java.util.*;
 
class Solution {
    
    // search pattern using KMP algorithm
    ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        int m = pat.length();
        int n = txt.length();
        
        int[] lps = new int[m];
        computeLPS(pat, m, lps);
        
        int i = 0;   
        int j = 0;
        
        while (i < n) {
            if (pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;
                
                if (j == m) {
                    ans.add(i - j + 1);  // Add index (one-based) of the occurrence
                    j = lps[j - 1];
                }
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        
        if (ans.isEmpty()) {
            ans.add(-1);   
        }
        
        return ans;
    }
    
     void computeLPS(String pat, int m, int[] lps) {
        int len = 0;
        int i = 1;
        
        lps[0] = 0;
        
        while (i < m) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }
}


 