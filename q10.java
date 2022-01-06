import java.util.*;
public class q10 {
    class Solution
{
    //Function to return k largest elements from an array.
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=arr.length-1;i> n-k-1;i--){
            ans.add(arr[i]);
        }
        return ans;
    }
}
}
