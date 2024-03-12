package codingtst.DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q_1167 {
    static ArrayList<int[]>[] arr;
    static boolean[] checked;
    static int max = 0;
    static int far_node = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int V = Integer.parseInt(br.readLine());


        //그래프 생성
        arr = new ArrayList[V+1];
        for(int i =1; i<=V; i++){
            arr[i] = new ArrayList<int[]>();
        }

        for(int i =0;i<V; i++){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());

            while (true){
                int b = Integer.parseInt(st.nextToken());
                if(b==-1) break;
                int c = Integer.parseInt(st.nextToken());
                arr[a].add(new int[]{b,c});
            }
        }

        checked = new boolean[V+1];
        DFS(1,0);
        max= 0;

        checked = new boolean[V+1];
        DFS(far_node,0);

        System.out.println(max);

    }


    static void DFS(int n, int distance){
        if(distance>max) {
            max = distance;
            far_node = n;
        }
        checked[n] = true;
        for(int[] i : arr[n]){
            if(!checked[i[0]]){
                DFS(i[0],distance+i[1]);
            }
        }
    }
}
