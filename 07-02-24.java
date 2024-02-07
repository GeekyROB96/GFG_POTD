/*
 * Minimum distance between  2 nodes in binary tree
 * 
 * Given a binary tree with n nodes and two node values, a and b, your task is to find the minimum distance between them. The given two nodes are guaranteed to be in the binary tree and all node values are unique.
//
Example 1:

Input:
        1
      /  \
     2    3
a = 2, b = 3
Output: 
2
Explanation: 
We need the distance between 2 and 3. Being at node 2, we need to take two steps ahead in order to reach node 3. The path followed will be: 2 -> 1 -> 3. Hence, the result is 2.
 */


 class GfG {
    int findDist(Node root, int a, int b) {
        // Your code here
        
        Node lca = LCA(root,a,b);
        
        
        int dist = level(lca,a) +level(lca,b);
        
        return dist;
    }
    
    Node LCA(Node root, int n1, int n2){
        
        if(root == null) return null;
        
        
        if(root.data == n1 || root.data == n2) return root;
        
        
        Node left = LCA(root.left,n1,n2);
        Node right = LCA(root.right,n1,n2);
        
        if(left != null && right != null) return root;
        
        if(left==null)return right;
        
        else return left;
    }
    
    
    
    
    int level(Node root, int a){
        
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int level =0;
        
        while(!q.isEmpty()){
            int size =q.size();//mark
            for(int i =0;i<size;i++){
                Node curr = q.poll();
                
                if(curr.data == a) return level;
                
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
                
                
                
            }
            level++;
            
            
        }
        
        return -1;
    }
}