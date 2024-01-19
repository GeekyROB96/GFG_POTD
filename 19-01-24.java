/*
 * 
 * Top k numbers in stream
Given N numbers in an array, your task is to keep at most the top K numbers with respect to their frequency.

In other words, you have to iterate over the array, and after each index, determine the top K most frequent numbers until that iteration and store them in an array in decreasing order of frequency. An array will be formed for each iteration and stored in an array of arrays. If the total number of distinct elements is less than K, then keep all the distinct numbers in the array. If two numbers have equal frequency, place the smaller number first in the array.

Example 1:

Input:
N=5, K=4
arr[] = {5, 2, 1, 3, 2} 
Output: 
5 
2 5 
1 2 5 
1 2 3 5 
2 1 3 5 

 */



import java.util.*;
class Solution {
    public static ArrayList<ArrayList<Integer>> kTop(int[] arr, int N, int K) {
      
      
      HashMap<Integer,Integer> map = new HashMap<>();
      ArrayList<ArrayList<Integer>> al = new ArrayList<>();
      
      for(int i =0;i<N;i++){
          
          map.put(arr[i],map.getOrDefault(arr[i],0)+1);
          
          PriorityQueue<Map.Entry<Integer,Integer /*new cmd */>> pq  = new PriorityQueue<>(
              (a,b) -> a.getValue() == b.getValue() ? a.getKey() - b.getKey() : b.getValue() - a.getValue());
              
              
          pq.addAll(map.entrySet()); //new cmd
          
          
          ArrayList<Integer> res = new ArrayList<>();
          
          
          while(!pq.isEmpty() && res.size()<K){
              
              Map.Entry<Integer, Integer> entry = pq.poll();
              res.add(entry.getKey());
          }
              
              al.add(new ArrayList<>(res));
              
      }
      return al;
  }
}
      
