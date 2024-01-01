/*
 * 
 * Array Sum Divisiblity problem
 * 
 * 
 * Given an array of integers nums and a number k, write a function that returns true if given array can be divided into pairs such that sum of every pair is divisible by k.

Example 1 :

Input : 
nums = [9, 5, 7, 3]
k = 6
Output: 
True
Explanation: 
{(9, 3), (5, 7)} is a 
possible solution. 9 + 3 = 12 is divisible
by 6 and 7 + 5 = 12 is also divisible by 6.

 */

import java.util.HashMap;

class Solution {
    public boolean canPair(int[] nums, int k) {
 
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;

        if (n == 0 || n % 2 != 0) return false;

        for (int i = 0; i < n; i++) {
            int cur = nums[i] % k;
            int rem = (k - cur) % k;

            if (map.containsKey(rem)) {
                // decrease frequency
                int freq = map.get(rem);
                if (freq == 1) {
                    map.remove(rem);
                } else {
                    map.put(rem, freq - 1);
                }
            } else {
                // add to the map
                map.put(cur, map.getOrDefault(cur, 0) + 1);
            }
        }
        return map.size() == 0;
    }
}

