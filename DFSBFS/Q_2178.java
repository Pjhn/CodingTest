package codingtst.DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q_2178 {
    static int[][] arr;
    static boolean[][] checked;
    //오른쪽, 아래, 왼쪽, 위
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};

    static int N,M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        N= Integer.parseInt(st.nextToken());
        M= Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        checked = new boolean[N][M];

        for(int i =0; i<N;i++){
            String input = br.readLine();
            for(int j =0; j<M; j++){
                arr[i][j] = Integer.parseInt(input.substring(j,j+1));
            }
        }
        //BFS 실행 및 출력
        BFS(0,0);
        System.out.println(arr[N-1][M-1]);
    }

    //좌표를 배열에 넣는 아이디어 생각
    static void BFS(int i,int j){
        Queue<int[]> q = new LinkedList<>();

        int[] first_coord = {i,j};
        q.offer(first_coord);
        checked[i][j] = true;

        while (!q.isEmpty()){
            int[] now = q.poll();
            for(int s =0; s<4; s++){
                int x = now[0] + dx[s];
                int y = now[1] + dy[s];

                //x,y가 arr을 벗어나는지 체크
                if(x>=0 && y>=0 && x<N && y<M){
                    //checked 되어있지 않고 x,y좌표의 값이 1 이면 q에 넣어야함
                    if(!checked[x][y] && arr[x][y] == 1){
                        q.offer(new int[]{x,y});
                        checked[x][y] = true;

                        //현재 탐색 좌표값에서 1씩 더해줘야함(깊이 추가)
                        arr[x][y] = arr[now[0]][now[1]] + 1;

                    }
                }
            }
        }
    }
}
