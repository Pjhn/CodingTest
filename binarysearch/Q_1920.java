package codingtst.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine()," ");
        for(int i =0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //이진탐색할때 배열해야함
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb =new StringBuilder();

        for(int i=0; i<M; i++){
            boolean find = false;
            int goal = Integer.parseInt(st.nextToken());
            int start = 0;
            int end = arr.length -1;
            while (start<=end){
                int mid = (start+end)/2;

                if(goal>arr[mid]){
                    start = mid+1;
                } else if (goal<arr[mid]) {
                    end = mid-1;
                } else {
                    find = true;
                    break;
                }
            }
            if(find ==true){
                sb.append("1").append("\n");
            }else {
                sb.append("0").append("\n");
            }
        }

        System.out.println(sb);
    }
}
