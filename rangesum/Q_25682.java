package codingtst.rangesum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_25682 {

    static int N;
    static int M;
    static int K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        //입력 배열 생성
        char[][] input = new char[N+1][M+1];
        for (int i = 1; i <=N; i++) {
            String rd = br.readLine();
            for (int j = 1; j <=M; j++) {
                input[i][j] = rd.charAt(j-1);
            }
        }

        System.out.println(Math.min(min_change('W',input),min_change('B',input)));



    }

    static int min_change(char color, char[][] input){

        //합배열 생성
        int changed;
        int[][] sumArr = new int[N + 1][M+1];
        for (int i = 1; i < input.length; i++)
            for (int j = 1; j < input[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    changed =input[i][j] != color ? 1 : 0;
                }else {
                    changed = input[i][j] == color ? 1 : 0;
                }
                sumArr[i][j] =sumArr[i][j-1] + sumArr[i-1][j] - sumArr[i-1][j-1] + changed;
            }

        int count =Integer.MAX_VALUE;
        int result;
        for(int i = K; i<=N; i++)
            for(int j =K; j<=M; j++){
                result =sumArr[i][j] - sumArr[i][j-K] - sumArr[i-K][j] + sumArr[i-K][j-K];
                count = Math.min(count,result);
            }

        return count;
    }
}
