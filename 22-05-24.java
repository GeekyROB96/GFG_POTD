import java.util.*;

class Solution{

    public static double findSmallestMaxDist(int stations[], int k) {
        // code here

      int n = stations.length;

      int[] howMany = new int[n-1];

      PriorityQueue<Pair<double , int>> pq = new PriorityQueue<>();

      for(int i =0;i<n-1;i++){

        pq.push({stations[i+1] - stations[i], i });
      }


      for(int gasStations = 1;gasStations<=k;gasStations++){

        Pair p = pq.poll();

        int sectionIdx = p.second;
        howMany[sectionIdx]++;

        double initialDiff = stations[i+1] - stations[i];
        double newSecLen = initialDiff/(long)(howMany[sectionIdx]+1);

        pq.push({newSecLen,sectionIdx});
      }
      return pq.poll().first;

}

}