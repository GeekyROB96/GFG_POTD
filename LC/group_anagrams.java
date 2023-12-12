package LC;
 
/*
 * Group Anagrams
 * 
 * 
 * 
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]
 */

 import java.util.*;


 class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();


        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);

            String sorted = new String(ch);

            if(!map.containsKey(sorted)) {
            map.put(sorted,new LinkedList<String>());
            }
            map.get(sorted).add(s);
        }

        return new LinkedList<>(map.values());
    }
}  // better approach - count no of each letter in each string and if same make them a group .. but its messy to code so i bettter avoid it