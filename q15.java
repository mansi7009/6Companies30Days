public class q15 {
    class Solution {
        public boolean canArrange(int[] arr, int k) {
               
            HashMap<Integer,Integer> fmap = new HashMap<>();
            for(int val: arr){
                int rem = ((val%k) + k)%k;
               
                fmap.put(rem,fmap.getOrDefault(rem,0)+1);
            }
            
            for(int val:arr){
                int rem= val%k;
                if(rem == 0 ){
                    if(fmap.get(rem) %2!=0){
                        return false;
                    }
                }else if( 2*rem == k ){
                    if( fmap.getOrDefault(rem,0) %2 != 0){
                        return false;
                    }
                }else {
                    int f1 = fmap.get(rem);
                    int f2 = fmap.getOrDefault(rem-k,0);
                    if(f1 != f2){
                        return false;
                    }
                }
            }
            return true;        
        }
    }
}
