/*
 * 
 * You are given an undirected graph of N nodes and M edges. Return 1 if the graph is a tree, else return 0.

Note: The input graph can have self-loops and multiple edges.

Example 1:

Input:
N = 4, M = 3
G = [[0, 1], [1, 2], [1, 3]]
Output: 
1
Explanation: 
Every node is reachable and the graph has no loops, so it is a tree
 */


 class Solution {
    public boolean isTree(int n, int m, ArrayList<ArrayList<Integer>> edges) {
        // code here

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            graph.get(edges.get(i).get(0)).add(edges.get(i).get(1));
            graph.get(edges.get(i).get(1)).add(edges.get(i).get(0));
        }

        Set<Integer> visited = new HashSet<>();

        boolean ans = isCycle(graph, visited, -1, 0); // Pass -1 as the parent for the starting node.

        if (visited.size() != n) {
            return false; // graph not connected
        }

        return ans;
    }

    public boolean isCycle(List<List<Integer>> graph, Set<Integer> visited, int parent, int curr) {
        visited.add(curr);

        for (int neighbour : graph.get(curr)) {
            if (!visited.contains(neighbour)) {
                if (!isCycle(graph, visited, curr, neighbour)) {
                    return false;
                }
            } else if (neighbour != parent) {
                return false;
            }
        }

        return true;
    }
}