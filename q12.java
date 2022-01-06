public class q12 {
    public static Long squaresInChessBoard(Long N) {
        long ans = 0;
        for(long i=1;i<=N;i++){
            ans+=i*i;
        }
         return ans;
         
     }
}
