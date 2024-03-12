package codingtst.arrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        StringTokenizer s1 = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];
        for(int i = 0; i<arr.length; i++){
            arr[i]= Integer.parseInt(s1.nextToken());
        }
        Arrays.sort(arr);

        int left = 0;
        int right = N-1;
        int sum = 0;
        int count = 0;

        while(left<right){
            sum=arr[left]+arr[right];
            if(sum == M){
                count++;
                sum-=arr[left];
                left++;
            } else if (sum < M) {
                sum-=arr[left];
                left++;
            } else if (sum > M) {
                sum-=arr[right];
                right--;
            }
        }
        System.out.println(count);

    }
}
