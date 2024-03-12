package codingtst.arrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        Stack<Integer> stack = new Stack<>();
        //자연수 카운팅
        int count = 1;
        for(int i =0; i<n; i++){
            int num = Integer.parseInt(br.readLine());


            while(stack.empty() || stack.peek()<num){
                stack.push(count++);
                sb.append("+\n");
            }
            if(stack.peek() == num){
                stack.pop();
                sb.append("-\n");
            }
            //pop으로 스택에 저장된 마지막 수를 꺼낼 때,
            // 그 수가 입력받은 수와 다르다면 pop출력으로 수열을 만들지 못한다
            else{
                sb.setLength(0);
                sb.append("NO");
                break;
            }
        }
        System.out.println(sb);
    }
}
