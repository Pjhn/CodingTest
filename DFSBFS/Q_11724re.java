package codingtst.DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q_11724re {
    static ArrayList<Integer>[] graph;
    static boolean[] checked;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N+1];
        checked= new boolean[N+1];
        
        for(int i =1; i<N+1;i++){
            graph[i] = new ArrayList<>();
        }

        while (M-->0){
            st = new StringTokenizer(br.readLine()," ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph[u].add(v);
            graph[v].add(u);
        }
        int count = 0;
        for(int i =1; i<= N; i++){
            if(!checked[i]){
                count++;
                DFS(i);
            }
        }

        System.out.println(count);


    }

    static void DFS(int N){
        if (checked[N]) return;

        checked[N] = true;
        for(int i : graph[N]){
            if(!checked[i]){
                DFS(i);
            }
        }
    }
}
