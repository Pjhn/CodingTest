package codingtst.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q_1918 {
    public static void main(String[] args) throws IOException {
        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        Stack<Character> st = new Stack<>();

        for(char c : line.toCharArray()){
            if(Character.isUpperCase(c)){
                sb.append(c);
                continue;
            }
            switch (c){
                case '(': st.add(c); break;
                case '*':case '/':{
                    while(!st.isEmpty()){
                        if(st.peek()=='*'||st.peek()=='/')
                            sb.append(st.pop());
                        else {
                            break;
                        }
                    }
                    st.add(c);
                    break;
                }
                case '+': case'-':{
                    while (!st.isEmpty()){
                        if(st.peek()!='('){
                            sb.append(st.pop());
                        }else break;
                    }
                    st.add(c);
                    break;
                }
                case ')':{
                    while (!st.isEmpty()){
                        if(st.peek()=='('){
                            st.pop();
                            break;
                        }else sb.append(st.pop());
                    }
                    break;
                }
            }
        }
        while(!st.isEmpty()) sb.append(st.pop());
        System.out.println(sb);
    }
}
