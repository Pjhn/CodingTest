package codingtst.DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q_2667 {

    static int N;
    static int[][] arr;
    static boolean[][] checked;
    static Queue<int[]> q = new LinkedList<>();
    static int count = 0;

    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};

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

        PriorityQueue<Integer> count_store = new PriorityQueue<>();
        StringBuilder sb =new StringBuilder();


        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                if(!checked[i][j] && arr[i][j] == 1) {
                    BFS(i,j);
                    count_store.add(count);

                }
            }
        }
        sb.append(count_store.size()).append("\n");

        //PriorityQueue는 저장은 기존 순서대로 저장하지만 peek,poll 메서드로 꺼낼때만 우선순위에 맞게 꺼냄
   //     for(int i : count_store) sb.append(i).append("\n");

        while (!count_store.isEmpty()) sb.append(count_store.poll()).append("\n");
        System.out.println(sb);
    }

    public static void BFS(int i, int j){
        count = 0;
        q.offer(new int[]{i,j});
        checked[i][j] = true;


        while (!q.isEmpty()){
            int[] now  = q.poll();
            count++;
            for(int k =0; k<4; k++){
                int x = now[0]+dx[k];
                int y = now[1]+dy[k];

                if(x>=0 && y>=0 && x<N && y<N){
                    if(!checked[x][y] && arr[x][y] == 1){
                        checked[x][y] = true;
                        q.offer(new int[]{x,y});

                    }
                }
            }
        }
    }
}
