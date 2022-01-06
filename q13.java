import java.util.Stack;

import java.util.*;
public class q13 {
    public static void decodeString(String str){
        String ans="";
        Stack<Character> st = new Stack<>();

        for(int i=0;i<str.length();i++ ){
            char ch = str.charAt(i);
            if(ch ==']'){
                String temp = "";
                while(!st.empty() && st.peek() !=']'){
                    temp = st.peek()+temp;
                    st.pop();
                }

                st.pop();
                String num ="";
                while(!st.empty() && isDigit(st.peek())){
                    num = st.peek() + num;
                    st.pop();
                }

                int n = String.parseInt(num);
                
                String rep = "";
                for(int j=0;j<n;j++){
                    rep+=temp;
                }
                for(int k=0;k<rep.length();k++){
                    char c = rep.charAt(k);
                    st.push(c);
                }


            }else{
                st.push(ch);
            }
        }
    
        while(!st.empty()){
            ans = st.peek()+ans;
            st.pop();
        }
        return ans;
    }


}
