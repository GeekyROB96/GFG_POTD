/*
 * 
 * Techfest and the Queue



 A Techfest is underway, and each participant is given a ticket with a unique number. Organizers decide to award prize points to everyone who has a ticket ID between a and b (inclusive). The points given to a participant with ticket number x will be the sum of powers of the prime factors of x.

For instance, if points are to be awarded to a participant with ticket number 12, the amount of points given out will be equal to the sum of powers in the prime factorization of 12 (22 × 31), which will be 2 + 1 = 3.

Given a and b, determine the sum of all the points that will be awarded to the participants with ticket numbers between a and b (inclusive).

Example 1:

Input: 
a = 9
b = 12
Output: 
8
Explanation: 
For 9, prime factorization is:32 
So, sum of the powers of primes is: 2
For 10, prime factorization is : 21x51 
So, sum of the powers of primes is: 2
For 11, prime factorization is : 111 
So, sum of the powers of primes is: 1
For 12, prime factorization is : 22x 31 
So, sum of powers of primes is: 3
Therefore the total sum is 2+2+1+3=8.

 */

 
import java.util.*;
class Solution {
    
   
    long ans = 0;

    public void primeFactors(long n) {
        HashMap<Long, Long> pf = new HashMap<>();

        while (n % 2 == 0) {
            pf.put(2L, pf.getOrDefault(2L, 0L) + 1);
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                pf.put((long) i, pf.getOrDefault((long) i, 0L) + 1);
                n /= i;
            }
        }

        if (n > 2) pf.put(n, pf.getOrDefault(n, 0L) + 1);

        for (long powers : pf.values()) {
            ans += powers;
        }
    }

    public long sumOfPowers(long a, long b) {
        ans = 0;
        for (long i = a; i <= b; i++) {
            primeFactors(i);
        }
        return ans;
    }

}
        
