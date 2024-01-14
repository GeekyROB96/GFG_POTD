/*
 * 
 * Find duplicate rows in a binary matrix

 */


import java.util.*;
class Solution {
    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            StringBuilder s = new StringBuilder();
            for (int j = 0; j < n; j++) {
                s.append(matrix[i][j]);
            }
            
            String key = s.toString();
            
            if (map.containsKey(key)) {
                ans.add(i);
            } else {
                map.put(key, i);
            }
        }

        return ans;
    }
}