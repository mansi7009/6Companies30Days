class Solution {
    
    public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
        if(k==0){
            return 0;
        }
        
        int start = 0,end = 0;
        long p = 1;
        int count = 0;
        while(start <= end && end<a.length){
            p *= a[end];
            while(start<a.length && p>=k){
                p /= a[start];
                start++;
            }
            
            if(p<k){
                count += (end-start+1);
                end++;
            }
        }
        return count;
    }
}