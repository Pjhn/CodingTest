package codingtst.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");


        HashMap<Integer,Integer> hashMap = new HashMap<>();

        int[] arr = new int[N];
        int[] sorted = new int[N];



        for(int i =0; i<N; i++){
            sorted[i] = arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sorted);

        // hashmap
        int rank =0;
        for(int n : sorted){
            if(!hashMap.containsKey(n)){
                hashMap.put(n,rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i =0; i< arr.length; i++){
            sb.append(hashMap.get(arr[i])).append(" ");
        }
        System.out.println(sb);




    }
}
