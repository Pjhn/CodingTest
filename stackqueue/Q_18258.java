package codingtst.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Q_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String input;
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque();

        while (N-->0){
            st = new StringTokenizer(br.readLine()," ");
            input = st.nextToken();
            switch (input){
                case "push":{
                    int i = Integer.parseInt(st.nextToken());
                    deque.offerLast(i);
                    break;
                }
                case "pop":{
                    if(deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    }else {
                        sb.append(deque.pollFirst()).append("\n");
                    }
                    break;
                }
                case "size":{
                    sb.append(deque.size()).append("\n");
                    break;
                }
                case "empty":{
                    if(deque.isEmpty()){
                        sb.append(1).append("\n");
                    }else {
                        sb.append(0).append("\n");
                    }
                    break;
                }
                case "front":{
                    if(deque.isEmpty()){
                        sb.append(-1).append("\n");
                    }else {
                        sb.append(deque.peekFirst()).append("\n");
                    }
                    break;
                }
                case "back":{
                    if(deque.isEmpty()){
                        sb.append(-1).append("\n");
                    }else {
                        sb.append(deque.peekLast()).append("\n");
                    }
                    break;
                }

            }
        }
        System.out.println(sb);
    }
}
