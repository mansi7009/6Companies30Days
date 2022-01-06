class q5NaiveApproach {
    /* Function to get the nth ugly number*/
    int isUgly(int n){
        while(n%2==0){
            n/=2;
        }
        while(n%3==0){
            n/=3;
        }
        while(n%5==0){
            n/=5;
        }
        if(n==1){
            return 1;
        }else{
            return 0;
        }
    }
    long getNthUglyNo(int n) {
        int count = 1,i=1;
        while(count < n){
            i++;
            if(isUgly(i)==1){
                count++;
            }
        }
        
        return i;
        
    }
}