package codingtst.d1Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_10810 {
    static void inputBall(int[] arr, int start, int end , int k){
        for(int i = start; i<=end; i++){
            arr[i] = k;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //배열 생성
        int[] bucket = new int[N+1];

        int i, j, k;
        for (int l = 0; l<M; l++){
            st = new StringTokenizer(br.readLine()," ");
            i = Integer.parseInt(st.nextToken());
            j = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            inputBall(bucket,i,j,k);
        }

        //출력
        StringBuilder sb = new StringBuilder();
        for(int m =1; m<=N; m++) sb.append(bucket[m]).append(" ");

        System.out.println(sb);
    }
}
