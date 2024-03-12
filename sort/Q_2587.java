package codingtst.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];

        for(int i = 0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        //중앙값
        int mid = arr[2];
        //평균
        int sum =0;
        for(int n : arr ) sum+= n;
        int avg =sum/arr.length;

        System.out.println(avg+"\n"+mid);

    }
}
