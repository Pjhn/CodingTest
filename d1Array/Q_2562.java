package codingtst.d1Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //배열 생성
        int[] arr = new int[9];

        for(int i =0; i<arr.length; i++ )
            arr[i] = Integer.parseInt(br.readLine());

        //비교
        int seq = 0;
        int Max = arr[0];

        for(int i =0; i< arr.length; i++){
            if(arr[i]>Max){
                Max = arr[i];
                seq = i;
            }
        }
        //출력
        System.out.println(Max+"\n"+(seq+1));
    }
}
