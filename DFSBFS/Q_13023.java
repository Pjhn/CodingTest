package codingtst.DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q_13023 {

    static ArrayList<Integer>[] arrA;
    static boolean[] check;

    static int ok;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arrA = new ArrayList[N];
        check = new boolean[N];

        for(int i = 0; i<N; i++){
            arrA[i] = new ArrayList<>();
        }

        while (M-->0){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arrA[a].add(b);
            arrA[b].add(a);
        }

        for(int i = 0; i<N; i++){
            if(ok ==1)break;
            DFS(i, 1);
        }

        System.out.println(ok);
    }

    static void DFS(int n, int depth){
        if(ok==1) return;
        if(depth == 5) {
            ok =1;
            return;
        }

        check[n] = true;
        for(int i : arrA[n]){
            if(!check[i]){
                DFS(i,depth+1);
            }
        }

        //check[n] = false;
    }
}
