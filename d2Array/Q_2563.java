package codingtst.d2Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_2563 {
    static void changeBlack(int[][] arr,int x,int y ){
        for(int i =x; i<x+10 && i< arr.length; i++){
            for(int j = y; j<y+10 && j<arr[i].length; j++){
                arr[i][j] = 1;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        //배열 생성
        int[][] paper = new int[101][101];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            changeBlack(paper, x, y);
        }

        //배열 탐색
        int count = 0;
        for (int i = 0; i < paper.length; i++) {
            for (int j = 0; j < paper[i].length; j++) {
                if (paper[i][j] == 1) count++;
            }
        }
        System.out.println(count);
    }
}
