package codingtst.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_9012 {

    static StringBuilder sb = new StringBuilder();

    static void Parenthesis(String input){
        char[] chars = input.toCharArray();
        int leftCount =0;
        int rightCount =0;

        for (char aChar : chars) {
            if (aChar == '(') leftCount++;
            else if (aChar == ')') {
                rightCount++;
                if(rightCount>leftCount){
                    sb.append("NO").append("\n");
                    return;
                }
            }
        }
        if(leftCount == rightCount) sb.append("YES").append("\n");
        else sb.append("NO").append("\n");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i =0; i<T; i++){
            Parenthesis(br.readLine());
        }
        System.out.println(sb);
    }
}
