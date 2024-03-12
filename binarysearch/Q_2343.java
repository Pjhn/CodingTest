package codingtst.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_2343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");

        int[] arr= new int[N];
        int end = 0;
        int start = 0;
        for(int i =0; i<N; i++){
            arr[i]= Integer.parseInt(st.nextToken());
            end += arr[i];
            start = Math.max(start,arr[i]);
        }


        while (start<=end){
            int sum =0;
            int count = 0;
            int mid = (start+end)/2;
            for(int i : arr){
                if (sum + i > mid) {
                    count++;
                    sum = 0;
                }
                sum+=i;
            }
            count++;

            if (count<=M) end = mid -1;
            else start = mid+1;
        }

        System.out.println(start);


    }
}
