/*
 * 
 * Brothers From Different Roots
EasyAccuracy: 53.04%Submissions: 35K+Points: 2



Given two BSTs containing N1 and N2 distinct nodes respectively and given a value x, your task is to complete the function countPairs(), that returns the count of all pairs of (a, b), where a belongs to one BST and b belongs to another BST, such that a + b = x.

Example 1:

Input:
BST1:
       5
     /   \
    3     7
   / \   / \
  2   4 6   8
BST2:
       10
     /    \
    6      15
   / \    /  \
  3   8  11   18
x = 16
Output:
3
Explanation:
The pairs are: (5, 11), (6, 10) and (8, 8)
 */


import java.util.*;
class Solution
{
    
    public static void inorder(Node root,ArrayList<Integer> a){
        
        
        if(root == null) return;
        
        inorder(root.left,a);
        a.add(root.data);
        inorder(root.right,a);
    }
    
    
	public static int countPairs(Node root1, Node root2, int x)
	{
		// Code here
		ArrayList<Integer> a1 = new ArrayList<>();
    ArrayList<Integer> a2 = new ArrayList<>();
		
		inorder(root1,a1);
		inorder(root2,a2);

        int i=0, count =0;
        int j = a2.size()-1;
        
        while(i<a1.size() && j>=0){
            
            if((a1.get(i) + a2.get(j)) == x) {
                
                count++;
                i++;
                j--;
            }else if(a1.get(i)+ a2.get(j)>x) j--;
            
            else i++;
            
            
            
        }
        return count;


	}
}