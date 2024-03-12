package codingtst.rangesum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q_16139 {
    static HashMap<Character , int[]> sumMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        char[] k = br.readLine().toCharArray();
        for(char input : k){
            make_sumArr(k,input);
        }

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        while (N-->0){
            st = new StringTokenizer(br.readLine()," ");
            char alpha = st.nextToken().charAt(0);
            int l = Integer.parseInt(st.nextToken())+1;
            int r = Integer.parseInt(st.nextToken())+1;
            if(sumMap.containsKey(alpha)){
                int[] sum =  sumMap.get(alpha);
                count = sum[r]-sum[l-1];
                sb.append(count).append("\n");
            }else sb.append(0).append("\n");
        }

        System.out.println(sb);
    }

    static void make_sumArr(char[] arr, char input){
        if(!sumMap.containsKey(input)){
            int[] sumArr = new int[arr.length+1];
            for(int i = 1; i<=arr.length; i++){
                sumArr[i] = sumArr[i-1];
                if(arr[i-1] == input ){
                    sumArr[i]++;
                }
            }
            sumMap.put(input,sumArr);
        }
    }
}
