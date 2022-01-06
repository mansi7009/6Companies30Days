public class q5DP {
    class Solution {
        /* Function to get the nth ugly number*/
        long getNthUglyNo(int n) {
            
            long[] dp = new long[n+1];
            dp[1] = 1;
            int p2 = 1,p3 = 1,p5 = 1;
            for(int i=2;i<dp.length;i++){
                long v1 = 2 * dp[p2];
                long v2 = 3 * dp[p3];
                long v3 = 5 * dp[p5];
                dp[i] = Math.min(v1,Math.min(v2,v3));
                if(dp[i] == v1){
                    p2++;
                }
                if(dp[i] == v2){
                    p3++;
                }
                if(dp[i] == v3){
                    p5++;
                }
            }
            return dp[n];
        }
    }


}
