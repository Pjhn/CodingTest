package codingtst.d1Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N= Integer.parseInt(st.nextToken());
        int X= Integer.parseInt(st.nextToken());

        //수열 배열 생성
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i<arr.length; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        //비교 로직
        StringBuilder sb = new StringBuilder();
        for(int n : arr){
            if(n<X) sb.append(n).append(" ");
        }

        // 출력
        System.out.println(sb);
    }
}
