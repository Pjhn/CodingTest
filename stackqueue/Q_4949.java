package codingtst.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q_4949 {
    public static void main(String[] args) throws IOException {
        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //br.readline이 null이 아닐때까지 반복해서 구현메서드 실행
        while(true){
            String line = br.readLine();
            if(line.equals(".")) break;

            if(check(line)) sb.append("yes").append("\n");
            else sb.append("no").append("\n");
        }

        System.out.println(sb);

    }

    // 균형잡힌 문자열 판별
    private static boolean check(String s){
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='(' || c=='[' )st.push(c);
            else if (c==')') {
                if(st.isEmpty() || st.pop()!='(') return false;
            } else if (c==']') {
                if(st.isEmpty() || st.pop()!='[') return false;
            }
        }
        if(st.isEmpty()) return true;
        else return false;
    }


}
