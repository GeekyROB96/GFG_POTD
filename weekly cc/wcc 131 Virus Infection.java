// VIRUS INFECTION


/*
 * There are N people standing in a row, you are given a string s of length
N where s[i] = '1' if i person is infected with a virus and s[i] = '0' if not
infected. Given K, i person can infect up to K people on his left side
and up to K people on his right side.
Find the total number of people who are infected with the virus.
 * 
 * 
 * 
 * Example - s = "00100100" , k=1,
 * 
 * Output = 6;
 * 
 * Explanation: Both third and sixth person
an infect one person on their left side
nd one on their right side.


check for string  10000 , k = 2 .. output should be 3



 */


 class Solution {

    int infected(int i, StringBuilder sb, int k) {

        int x = k;

        for (int j = i - 1; j >= 0; j--) {

            x--;

            if (x >= 0) {

                if (sb.charAt(j) == '1') {
                    break;
                } else {
                    sb.setCharAt(j, '1');
                }
            } else {
                break;
            }
        }

        int y = k;
        int l;

        for (l = i + 1; l < sb.length(); l++) {

            y--;

            if (y >= 0) {

                if (sb.charAt(l) == '1') {
                    break;
                } else {
                    sb.setCharAt(l, '1');
                }
            } else {
                break;
            }
        }

        return l;
    }

    int solve(String s, int K) {

        int i = 0;
        StringBuilder sb = new StringBuilder(s);

        while (i < sb.length()) {

            if (sb.charAt(i) == '0') {
                i++;
            } else {
                i = infected(i, sb, K);
            }
        }

        int ans = 0;
        for (int j = 0; j < sb.length(); j++) {

            if (sb.charAt(j) == '1') {
                ans++;
            }
        }

        return ans;
    }
}
