package codingtst.DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q_1707 {
    static ArrayList<Integer>[] arr;
    static boolean[] checked;
    static int[] color;
    static boolean result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =new StringBuilder();
        StringTokenizer st;



        int K = Integer.parseInt(br.readLine());

        for(int i =0; i<K; i++){
            st = new StringTokenizer(br.readLine()," ");
            int V= Integer.parseInt(st.nextToken());
            int E= Integer.parseInt(st.nextToken());

            arr = new ArrayList[V+1];
            for(int l =1; l<=V; l++){
                arr[l] = new ArrayList<>();
            }
            checked = new boolean[V+1];
            color = new int[V+1];
            result = true;

            while (E-->0){
                st = new StringTokenizer(br.readLine()," ");
                int u = Integer.parseInt(st.nextToken());
                int v = Integer.parseInt(st.nextToken());

                arr[u].add(v);
                arr[v].add(u);
            }

            for(int j = 1; j<=V; j++){
                if(!checked[j]) BFS(j);
            }

            if(result==true) sb.append("YES").append("\n");
            else sb.append("NO").append("\n");
        }
        System.out.println(sb);
    }
    static void BFS(int i){
        Queue<Integer> q = new LinkedList<>();
        checked[i] = true;
        color[i] = 1;
        q.offer(i);

        while (!q.isEmpty()){
            int now = q.poll();
            int inverse_color = color[now] * -1;
            for(int k: arr[now]){
                if(color[k] == color[now]){
                    result = false;
                    return;
                }else if(!checked[k]){
                    checked[k] = true;
                    color[k] = inverse_color;
                    q.offer(k);
                }
            }
        }
        //result = true 덮어쓸수 있음
        //인덱스 실수가 잦다 조심하자

    }
}
