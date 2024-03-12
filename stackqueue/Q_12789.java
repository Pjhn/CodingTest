package codingtst.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q_12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> temp = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i =0; i<N; i++) {
             queue.offer(Integer.parseInt(st.nextToken()));
        }

        int count = 1;
        while(!queue.isEmpty()){
            if(queue.peek() == count) {
                queue.poll();
                count++;
            }
            else if (!temp.isEmpty() && temp.peek()==count) {
                temp.pop();
                count++;
            } else if (temp.isEmpty() || temp.peek()>queue.peek()) {
                temp.push(queue.poll());
            }else {
                System.out.println("Sad");
                System.exit(0);
            }
        }
        //stack 검사
        while(!temp.isEmpty()){
            if(temp.pop()!=count){
                System.out.println("Sad");
                System.exit(0);
            }else count++;
        }

        if(temp.size() ==0) System.out.println("Nice");


    }
}
