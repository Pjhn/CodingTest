package codingtst.arrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_11659 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer NM = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(NM.nextToken());
        int M = Integer.parseInt(NM.nextToken());

        long[] B = new long[N+1];

        StringTokenizer num = new StringTokenizer(br.readLine()," ");


        for(int i = 1; i<=N; i++){
            B[i] = B[i-1] + Integer.parseInt(num.nextToken());
        }
        for(int i = 0; i<M; i++) {
            StringTokenizer num2 = new StringTokenizer(br.readLine(), " ");
            int O = Integer.parseInt(num2.nextToken());
            int P = Integer.parseInt(num2.nextToken());

            System.out.println(B[P] - B[O-1]);
        }
    }
}
