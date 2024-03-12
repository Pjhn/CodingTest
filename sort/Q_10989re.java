package codingtst.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_10989re {
    //Max = 최대자리 수
    static void radixSort(int[] arr, int Max){

        int cnt = 1;
        int jarisu = 1;
        int[] count = new int[10];
        int[] temp = new int[arr.length];
        //최대 자리 수 까지 반복
        while(cnt<=Max){

        //count 초기화
        for(int i = 0; i < 10; i++) {
            count[i] = 0;
        }

        for(int i =0; i<arr.length; i++){
            count[arr[i]/jarisu%10]++;
        }


        //count의 누적합 -> 나중에 임시 배열의 index 요소가 됨
        for(int i =1; i< count.length; i++){
            count[i] +=count[i-1];
        }

        for(int i = arr.length-1; i>= 0; i--){
            temp[count[arr[i]/jarisu%10]-1] = arr[i];
            count[arr[i]/jarisu%10]--;
        }
        //배열 복사
        for(int i=0; i<arr.length; i++)
            arr[i] = temp[i];

        jarisu *= 10;
        cnt++;
    }}

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        //배열 생성
        int[] arr = new int[N];

        for(int i=0;i<arr.length; i++ ){
            arr[i] = Integer.parseInt(br.readLine());
        }

        radixSort(arr,5);

        //출력
        StringBuilder sb = new StringBuilder();
        for(int n : arr) sb.append(n).append(" ");

        System.out.println(sb);
    }
}
