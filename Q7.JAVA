public class Q7{
    public int findIndex(int n,int m,int k){
        if(m <= (n-k+1)){
            return (m-k+1);
        }
        nt val = m-(n-k+1);
        if(val%n==0){
            return n;
        }else{
            return val%n;
        }
    }
}
 