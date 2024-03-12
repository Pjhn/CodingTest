package codingtst.DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q_18352 {
    static Node[] nodes;
    static boolean[] checked;
    static StringBuilder sb =new StringBuilder();
    static PriorityQueue<Integer> pq = new PriorityQueue<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        nodes = new Node[N+1];
        checked = new boolean[N+1];

        for(int i = 1; i<= N; i++){
            nodes[i] = new Node(i);
        }

        while (M-->0){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            nodes[a].link.add(b);
        }

        BFS(X,0,K);
        while (!pq.isEmpty()){
            sb.append(pq.poll()).append("\n");
        }

        System.out.println(sb);
    }

    static void BFS(int X, int dep, int K){

        Queue<Integer> q = new LinkedList<>();
        checked[X] = true;
        q.offer(X);

        while (!q.isEmpty()){
            if(dep ==K) {
                while (!q.isEmpty()){
                    pq.add(q.poll());
                }
                return;
            }
            int size = q.size();
            while (size-->0){
                int now = q.poll();
                for(int i: nodes[now].link){
                    if(!checked[i]){
                        checked[i] = true;
                        q.offer(i);
                    }
                }
            }
            dep++;

        }

        System.out.println(-1);
        System.exit(0);
    }


    static class Node{
        int num;
        ArrayList<Integer> link;

        Node(int num){
            this.num = num;
            link = new ArrayList<>();
        }
    }
}
