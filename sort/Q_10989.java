package codingtst.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_10989 {
    public static void main(String[] args) throws IOException {
        //데이터 개수가 많은데 데이터 개별의 크기가 작으면 counting sort고려가능 O(n)
        //단점으로는 메모리 많이 잡아먹음

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[10001];
        int num ;

        for(int i =0; i<N; i++){
            num=Integer.parseInt(br.readLine());
            arr[num]++;
        }

        for(int i =1; i<=10000; i++){
            if(arr[i]==0)continue;
            while(arr[i]>0){
                sb.append(i).append("\n");
                arr[i]--;
            }
        }
        System.out.println(sb);
    }
}

