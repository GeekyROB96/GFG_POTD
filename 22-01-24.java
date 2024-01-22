


/*
 * Given a Binary tree and a sum S, print all the paths, starting from root, that sums upto the given sum. Path not necessarily end on a leaf node.
 */


class Solution
{
    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum)
    {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        solve(root,al,ans,sum,0);
        return ans;
    }
    
    public static void solve(Node root,ArrayList<Integer> al, ArrayList<ArrayList<Integer>> ans,int sum, int t){
        
        if(root == null) return;
        
        
        t = t+ root.data;
        al.add(root.data);
        if(t ==  sum) ans.add(new ArrayList<>(al));
        
        solve(root.left,al,ans,sum,t);
        solve(root.right,al,ans,sum,t);
        
        
        al.remove(al.size()-1);
        
    }
}