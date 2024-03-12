package codingtst.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Q_1427re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        Integer[] arr = new Integer[input.length()];

        for(int i =0; i<arr.length; i++){
            arr[i] = Integer.parseInt(input.substring(i,i+1));
        }
        //= Arrays.sort(arr, Comparator.reverseOrder());
        //원시타입배열은 sort에서 comparator 쓸수없다고 한다
        Arrays.sort(arr, (a,b)->b-a);

        for (int num : arr) {
            System.out.print(num);
        }
    }
}
