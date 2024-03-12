package codingtst.arrayList;


//import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2018 {
    public static void main(String[] args) throws IOException {
        /*Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //right인덱스가 N이면 무조건 자연수의 합은 1개(N)이니깐 count 1개
        int count = 1;
        //자연수 1부터 시작
        int sum = 1;
        int right = 1;
        int left = 1;

        while(right!=N){
            if(sum == N){
                count++;
                sum-=left;
                left++;

            } else if (sum < N) {
                right++;
                sum+=right;
            } else if (sum > N) {
                sum-=left;
                left++;

            }
        }
        System.out.println(count);


    }
}

