/*
 * 
 * Winner of Election
 * 
 * Given an array of n names arr of candidates in an election, 
 * where each name is a string of lowercase characters.
 *  A candidate name in the array represents a vote casted to the candidate.
 *  Print the name of the candidate that received the maximum count of votes.
 *  If there is a draw between two candidates, then print lexicographically smaller name.
 * 
 * 
 * Input:
n = 13
arr[] = {john,johnny,jackie,johnny,john 
jackie,jamie,jamie,john,johnny,jamie,
johnny,john}
Output: john 4
Explanation: john has 4 votes casted for 
him, but so does johny. john is 
lexicographically smaller, so we print 
john and the votes he received.
 */

import java.util.HashMap;

class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // add your code
        String[] winner = new String[2];
        HashMap<String,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        
        for(int i =0;i<n;i++) map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        
        for(String s: map.keySet()){
            if(map.get(s)>max){
                winner[0] = s;
                winner[1] = map.get(s).toString();
                max = map.get(s);
            }else if(map.get(s)==max){
                if(winner[0].compareTo(s)>0){
                    winner[0] =s;
                    winner[1] = map.get(s).toString();
                    max = map.get(s);
                }
            }
        }
        return winner;
    }
}