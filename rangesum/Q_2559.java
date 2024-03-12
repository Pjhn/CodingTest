package codingtst.rangesum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Q_2559 {
    static int maxSum(int[] arr,int K){
        int max =0;
        int sum =0;
        Deque<Integer> window = new ArrayDeque<>();
        //최소 합계 구하기
        for(int i =0; i<K; i++){
            window.offerLast(arr[i]);
            max += arr[i];
            sum += arr[i];
        }

        for(int i =0; i<= arr.length -K;i++){
            if(max < sum) max = sum;
            sum-= window.pollFirst();

            if(i+K <=arr.length-1){
                window.offerLast(arr[i+K]);
                sum+= window.peekLast();
            }

        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");

        int[] arr = new int[N];
        for(int i =0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = maxSum(arr,K);
        System.out.println(result);
    }
}
