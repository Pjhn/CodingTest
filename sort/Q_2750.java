package codingtst.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for(int i = 0; i<N; i++){
            arr[i]= Integer.parseInt(br.readLine());
        }

        int temp = -1;

        for(int j = 0; j<N-1; j++ ){
            for(int k =0; k<arr.length-1-j;k++){
                if(arr[k]>arr[k+1]){
                    temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
            }
        }
        for(int a : arr)
        System.out.println(a);

    }
}
