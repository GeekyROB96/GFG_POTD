/*
 * 
 * 
 * Buy maximum stocks if i stocks can be bought on ith day
 * 
 * 
 * 
 * In a stock market, there is a product with its infinite stocks. The stock prices are given for N days, where price[i] denotes the price of the stock on the ith day.
There is a rule that a customer can buy at most i stock on the ith day.
If the customer has an amount of k amount of money initially. The task is to find out the maximum number of stocks a customer can buy. 

Example 1:

Input:
price = [10,7,19]
k = 45
Output: 
4
Explanation: 
A customer purchases 1 stock on day 1, 2 stocks on day 2 and 1 stock on day 3 for 10, 7 * 2 = 14 and 19 respectively. Hence, total amount is 10 + 14 + 19 = 43 and number of stocks purchased is 4.
 */

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    
    
    static class Pair implements Comparable<Pair>{
        
        int price;
        int idx;
        
        public  Pair(int price, int idx){
            this.price = price;
            this.idx = idx;
        }
        
        public int compareTo(Pair second) {
            return Integer.compare(this.price, second.price);
        }
    }
    public static int buyMaximumProducts(int n, int k, int[] price) {
        // code here
        
        ArrayList<Pair> stocks = new ArrayList<>();
        
        int ans =0;
        
        for(int i =0;i<n;i++){
            
            stocks.add(new Pair(price[i],i+1));
            
        }
        
            Collections.sort(stocks);
            
            for(int i =0;i<n;i++){
                if(stocks.get(i).price*stocks.get(i).idx<=k){
                    ans+=stocks.get(i).idx;
                    k-= stocks.get(i).price*stocks.get(i).idx;
                }else {
            // If buying all stocks is not possible, buy only what can be afforded
                    ans += k / stocks.get(i).price;
                    break;
        }
            }
            
            return ans;
        
    }
}
        
