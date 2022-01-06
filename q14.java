import java.util.*;
public class q14 {
    class Solution {
        public int minSubArrayLen(int k, int[] arr) {
            int end = 0,strt = 0;
            int sum = 0;
            int minSize = Integer.MAX_VALUE;
            
            while(end<arr.length){
                sum+= arr[end];
                if(sum<k){
                    end++;
                }
                if(sum>=k){
                    int size = end-strt+1;
                    if(size<minSize){
                        minSize = size;
                    }
                    while(sum>k){
                        sum-=arr[strt];
                        strt++;
                        if(sum>=k && end-strt+1 <minSize){
                            minSize = end-strt+1;
                        }
                    }
                    end++;
                }
                   
                       
            }
            
            if(minSize == Integer.MAX_VALUE)
                return 0;
            return minSize;
        }
    }
}
