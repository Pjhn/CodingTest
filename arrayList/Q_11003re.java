package codingtst.arrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Q_11003re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s1 = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(s1.nextToken());
        int L = Integer.parseInt(s1.nextToken());

        StringTokenizer s2 = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();

        Deque<int[]> deque = new ArrayDeque<>(N);

        for(int i=0; i<N; i++){
            if (!deque.isEmpty()&&deque.peekFirst()[0]<=i-L){
                deque.pollFirst();
            }
            int num = Integer.parseInt(s2.nextToken());
            while(!deque.isEmpty()&&deque.peekLast()[1]>num){
                deque.pollLast();
            }

            deque.offerLast(new int[] {i,num});
            sb.append(deque.peekFirst()[1]).append(" ");
        }
        System.out.println(sb);
    }
}
