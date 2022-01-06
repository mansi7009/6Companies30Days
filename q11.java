public class q11 {
    int[] findTwoElement(int arr[], int n) {
        int[] ans = new int[2];
        int[] temp = new int[n+1];
        for(int i=0;i<arr.length;i++){
            if(temp[arr[i]] == 0){
                temp[arr[i]] = 1;
            }else if(temp[arr[i]] == 1){
                ans[0] = arr[i];
            }
        }
        for(int i=1;i<temp.length;i++){
            if(temp[i] == 0){
                ans[1] = i;
            }
        }
        
        return ans;
    }
}
