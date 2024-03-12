package codingtst.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int[] arr = new int[input.length()];
        /*for(int i =0; i<arr.length; i++){
            arr[i] = Integer.parseInt(String.valueOf(input.charAt(i)));

        }*/
        for(int i =0; i<arr.length; i++){
            arr[i] = Integer.parseInt(input.substring(i,i+1));
        }

        for(int i =0; i<arr.length; i++){
            int Max= i;
            for(int j =i; j< arr.length; j++){
                if(arr[Max] < arr[j]) Max = j;
            }
            int tmp = 0;
            if(arr[i]<arr[Max]){
                tmp = arr[i];
                arr[i] = arr[Max];
                arr[Max] = tmp;
            }
        }

        for(int i:arr) System.out.print(i);


    }
}
