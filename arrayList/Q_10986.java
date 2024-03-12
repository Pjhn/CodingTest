package codingtst.arrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(s.nextToken());
        int M = Integer.parseInt(s.nextToken());

        int[] sumArr = new int[N+1];

        // 숫자 입력 받기
        StringTokenizer s1 = new StringTokenizer(br.readLine()," ");

        //나머지로 구성된 합배열 만들기
        for(int i = 1; i<=N; i++){
            sumArr[i] = (sumArr[i-1] + Integer.parseInt(s1.nextToken()))%M;
        }

        //나머지 인덱스 배열
        int[] count = new int[M];
        long result = 0;


        for(int i = 1; i<=N; i++){
            if(sumArr[i]==0) result++;
            count[sumArr[i]]++;
        }

        for(int i =0; i<M;i++){
            if(count[i]>=2) result += (long)count[i]*(count[i]-1)/2;
        }
        System.out.print(result);
    }
}
