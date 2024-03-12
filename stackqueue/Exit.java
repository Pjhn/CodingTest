package codingtst.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exit {
    static int[] dx= {1,0,-1,0};
    static int[] dy= {0,-1,0,1};
    static int N;
    static boolean[][] checked;
    static int[][] arr;
    static int count = 1;
    static boolean find = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        checked = new boolean[N][N];

        //배열 생성
        for(int i = 0; i<N; i++){
            String s = br.readLine();
            for(int j = 0; j<N; j++){
                arr[i][j] = Integer.parseInt(s.substring(j,j+1));
            }
        }

        DFS(1,0,3,5);
        System.out.println(count);

    }

    private static void DFS(int a, int b, int goalX, int goalY){

        if(a==goalX && b == goalY) find = true;
        if(checked[a][b]) return;

        checked[a][b] = true;

        for(int i = 0; i<4; i++){
            int nextX = a+dx[i];
            int nextY = b+dy[i];

            if(find) return;
            if(nextX >=0 && nextX< N && nextY >=0 && nextY<N){
                if(arr[nextX][nextY] > 0 && !checked[nextX][nextY]){
                    count++;
                    System.out.printf("%d"+"%d",nextX, nextY);
                    DFS(nextX,nextY,goalX,goalY);
                }
            }
        }

    }
}
