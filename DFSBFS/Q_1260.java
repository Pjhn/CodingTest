package codingtst.DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q_1260 {
    static ArrayList<Integer>[] graph;
    static boolean checked [];
    static Queue<Integer> q = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N+1];
        checked = new boolean[N+1];

        for(int i = 1; i<= N; i++){
            graph[i] = new ArrayList<>();
        }

        while (M -- > 0){
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }

        DFS(V);
        System.out.println(sb);
        sb.setLength(0);

        checked = new boolean[N+1];
        BFS(V);
        System.out.println(sb);
    }

    static void DFS(int V){
        if(checked[V] == true)return;
        checked[V] = true;
        sb.append(V).append(" ");

        for(int i : graph[V]){
            if(!checked[i]){
                DFS(i);
            }
        }
    }

    static void BFS(int V){
        q.offer(V);
        checked[V]=true;

        while (!q.isEmpty()){
            int k =q.poll();
            sb.append(k).append(" ");
           for(int i: graph[k]){
               if(checked[i] == false){
                   checked[i]=true;
                   q.offer(i);
               }
           }
        }

    }

}
