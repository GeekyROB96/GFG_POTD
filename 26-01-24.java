// Fractional Knapsack


class Solution
{
    // Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {   
         Arrays.sort(arr, (a, b) -> Double.compare((double)b.value/b.weight, (double)a.value/a.weight));
        
        double sum = 0;
        
        for(int i = 0; i < n; i++) {
            if(arr[i].weight <= W) {
                sum += arr[i].value;
                W -= arr[i].weight;
            }
            else {
                sum += (double)arr[i].value * W / arr[i].weight;
                break;
            }
        }
        
        return sum;
    }
}
