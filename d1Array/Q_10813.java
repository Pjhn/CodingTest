package codingtst.d1Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_10813 {
    static void exchange(int[] arr, int o1, int o2){
        int temp = arr[o1];
        arr[o1] = arr[o2];
        arr[o2] = temp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] bucket = new int[N+1];
        for(int i =1; i<=N; i++)
            bucket[i] = i;

        for(int i =0; i<M; i++){
            st = new StringTokenizer(br.readLine()," ");
            int o1 = Integer.parseInt(st.nextToken());
            int o2 = Integer.parseInt(st.nextToken());
            exchange(bucket, o1, o2);
        }

        StringBuilder sb = new StringBuilder();
        for(int i =1; i<=N; i++) sb.append(bucket[i]).append(" ");

        System.out.println(sb);
    }
}
