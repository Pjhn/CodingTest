package codingtst.DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q_1325 {

    static ArrayList<Integer>[] arr;
    static boolean[] checked;
    static int[] count;
    static int max =Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new ArrayList[N+1];
        checked = new boolean[N+1];
        count = new int[N+1];

        for(int i = 1; i<=N; i++){
            arr[i] = new ArrayList<>();
        }

        while (M-->0){
            st = new StringTokenizer(br.readLine()," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            arr[A].add(B);
        }

        for(int i =1; i<=N; i++){
            checked = new boolean[N+1];
            BFS(i);
        }

        for(int i =1; i<=N; i++){
            if(count[i]>max){
                max = count[i];
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i<=N; i++){
            if(max == count[i]){
                sb.append(i).append(" ");
            }
        }

        System.out.println(sb);


    }

    static void BFS(int i){
        Queue<Integer> q = new LinkedList<>();
        if(checked[i]) return;
        checked[i] = true;
        q.offer(i);

        while (!q.isEmpty()){
            int now = q.poll();
            for(int k: arr[now]){
                if(!checked[k]){
                    checked[k] = true;
                    count[k]++;
                    q.offer(k);
                }
            }
        }
    }
}
