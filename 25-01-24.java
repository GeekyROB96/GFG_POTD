/*
 * 
 * Shortest Prime Path
 * 
 * 
 * You are given two four digit prime numbers num1 and num2. Find the distance of the shortest path from Num1 to Num2 that can be attained by altering only single digit at a time such that every number that we get after changing a digit is a four digit prime number with no leading zeros.

Example 1:

Input:
num1 = 1033 
num2 = 8179
Output: 6
Explanation:
1033 -> 1733 -> 3733 -> 3739 -> 3779 -> 8779 -> 8179.
There are only 6 steps reuired to reach num2 from num1. 
and all the intermediate numbers are 4 digit prime numbers.
 */

 class Solution {

    int[] prime = new int[10000];

    boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    int solve(int num1, int num2) {
        int[] res = new int[10000];
        Arrays.fill(res, -1);
        res[num1] = 0;

        Queue<Integer> q = new LinkedList<>();
        q.add(num1);

        while (!q.isEmpty()) {
            int num = q.remove();

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 10; j++) {
                    if (i == 0 && j == 0) continue; // Avoid leading zeros

                    String str = Integer.toString(num);
                    String newStr = str.substring(0, i) + String.valueOf(j) + str.substring(i + 1);

                    int newNum = Integer.valueOf(newStr);

                    if (newNum != num && isPrime(newNum) && res[newNum] == -1) {
                        res[newNum] = 1 + res[num];
                        q.add(newNum);
                    }
                }
            }
        }
        return res[num2];
    }
}