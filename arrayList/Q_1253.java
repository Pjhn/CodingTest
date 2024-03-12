package codingtst.arrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer s1 = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i<arr.length; i++){
            arr[i] = Integer.parseInt(s1.nextToken());
        }
        Arrays.sort(arr);

        int M = 0;
        int left = 0;
        int right = 0;
        int sum = 0;

        int count = 0;


        for(int i = 0; i< N; i++){
            M= arr[i];
            left = 0;
            //음수가 있기 때문에 M보다 더 큰 수를 더해도 M이 나올 수 있음
            right = N-1;
            while(left<right){
                sum = arr[left]+arr[right];
                if(sum== M){
                    if(left!=i && right!=i) {
                        count++;
                        break;
                    } else if (right == i) {
                        right--;
                    } else if (left == i) {
                        left++;
                    }

                } else if (sum > M) {
                    right--;
                } else if (sum < M) {
                    left++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(count);
        System.out.println(sb);
        br.close();

    }
}
