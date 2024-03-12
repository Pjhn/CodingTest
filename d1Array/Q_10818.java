package codingtst.d1Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        //배열 생성
        int[] arr = new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //수열 비교
        int Max = arr[0];
        int Min = arr[0];
        for(int n : arr){
            if(n>Max) Max = n;
            if(n<Min) Min = n;
        }
        //출력
        System.out.println(Min+" "+Max);
    }
}
