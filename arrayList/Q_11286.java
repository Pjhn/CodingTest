package codingtst.arrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        //최댓값 최솟값 찾기 유리한 구조 -> 우선순위 큐
        Queue<Integer> pq = new PriorityQueue<>((object1,object2)->{
            int absO1 = Math.abs(object1);
            int absO2 = Math.abs(object2);
            if(absO1==absO2) return object1>object2 ? 1:-1;// 절댓값이 같을 때 우선순위 정렬
            else return absO1-absO2; //절댓값 기준으로 정렬
        });
        //연산 수 만큼 반복
        for(int i = 0; i<N; i++){
            int x = Integer.parseInt(br.readLine());
            //정수 x가 0 이 아닐때
            if(x!=0){
                pq.offer(x);
            }else {
                Integer polled= pq.poll();
                if (polled == null){
                    sb.append("0").append("\n");
                }else{
                    sb.append(polled).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
