/*
 * Course Schedule(already done)
 * 
 * 
 * There are a total of n tasks you have to pick, labelled from 0 to n-1. Some tasks may have prerequisite tasks, for example to pick task 0 you have to first finish tasks 1,
 *  which is expressed as a pair: [0, 1]
Given the total number of n tasks and a list of prerequisite pairs of size m. Find a ordering of tasks you should pick to finish all tasks.
Note: There may be multiple correct orders, you just need to return any one of them. If it is impossible to finish all tasks, return an empty array.
 Driver code will print "No Ordering Possible", on returning an empty array. Returning any correct order will give the output as 1,
 whereas any invalid order will give the output 0. 
 */



class Solution {
    static int[] findOrder(int numCourses, int numPrerequisites, ArrayList<ArrayList<Integer>> prerequisites) {
        int[] indegree = new int[numCourses];
        List<Integer>[] adj = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adj[i] = new ArrayList<>();
        }

        for (ArrayList<Integer> prerequisite : prerequisites) {
            int course = prerequisite.get(0);
            int prerequisiteCourse = prerequisite.get(1);
            adj[prerequisiteCourse].add(course);
            indegree[course]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        int[] result = new int[numCourses];
        int index = 0;

        while (!queue.isEmpty()) {
            int currentCourse = queue.poll();
            result[index++] = currentCourse;

            for (int neighbor : adj[currentCourse]) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }

        // Check if all courses are taken
        if (index == numCourses) {
            return result;
        } else {
            return new int[0]; // It is impossible to finish all courses
        }
    }
}