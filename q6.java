class Solutions {

    public int gcd(int n1,int n2){
        
       while(n1%n2 != 0){
           int rem = n1%n2;
           n1= n2;
           n2 = rem;
       }
        return n2;
    }
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";//gcd does not exists
        }
        return str1.substring(0,gcd(str1.length(),str2.length()));        
    }public class q6 {
        
    }
    
}