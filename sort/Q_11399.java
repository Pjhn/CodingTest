package codingtst.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer s1 = new StringTokenizer(br.readLine()," ");


        int[] arr = new int[N];
        for(int i =0; i<N; i++)
            arr[i] = Integer.parseInt(s1.nextToken());
        int tmp = 0;

        //삽입정렬
        for(int i =0; i<N-1; i++){
            int j=i;
            while(j>=0 && arr[j]>arr[j+1] ){
                tmp =arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
                j--;
            }
        }

        /*//합정렬
        int[] sumArr = new int[N];
        sumArr[0] = arr[0];
        for(int k =1; k<N; k++){
            sumArr[k] = sumArr[k-1]+arr[k];
        }

        //sumArr 의 합
        int sum =0;
        for(int l=0; l<sumArr.length; l++)
            sum+= sumArr[l];

        System.out.println(sum);*/


        int prev = 0;	// 사람별 대기시간 누적합
        int sum2 = 0;	// 대기시간 총합

        for(int i = 0; i < N; i++) {
            // 누적합에 현재 걸리는 시간을 더한다
            prev += arr[i];
            //총합에 누적합을 더한다
            sum2 += prev;


        }
        System.out.println(sum2);


    }
}
