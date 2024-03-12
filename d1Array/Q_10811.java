package codingtst.d1Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_10811 {
    static void reverse(int[] arr, int start, int end){

        int part1=start;
        int part2=end;

        while(part1<part2){
            int temp = arr[part1];
            arr[part1] = arr[part2];
            arr[part2] =temp;

            part1++;
            part2--;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //바구니 생성
        int[] bucket = new int[N+1];

        for(int i =1; i<=N; i++)
            bucket[i] =i;

        for(int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine()," ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            reverse(bucket,start,end);
        }
        //출력
        StringBuilder sb =new StringBuilder();
        for(int i =1; i<=N; i++) sb.append(bucket[i]).append(" ");

        System.out.println(sb);
    }
}
