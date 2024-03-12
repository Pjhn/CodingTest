package codingtst.DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_5014 {

    static boolean[] checked;
    static int count = 0;
    static int F;
    static int S;
    static int G;
    static int U;
    static int D;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        F = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        G = Integer.parseInt(st.nextToken());
        U = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());

        //건물 생성
        checked = new boolean[F+1];

        move(S,G);

    }

    static void move(int now, int goal){
        if(checked[now]){
            System.out.println("use the stairs");
            return;
        }
        checked[now] = true;
        if(now<goal) {
            if(!(now+U>F)){
                now+=U;
                count++;
                move(now,goal);
            }
            else if(!(now-D<1)){
                now-=D;
                count++;
                move(now,goal);
            } else System.out.println("use the stairs");
        } else if (now>goal ) {
            if(!(now-D<1)){
                now-=D;
                count++;
                move(now,goal);
            } else if(!(now+U>F)) {
                now+=U;
                count++;
                move(now,goal);
            } else System.out.println("use the stairs");
        } else if (now == goal) {
            System.out.println(count);
            return;
        }
    }

}
