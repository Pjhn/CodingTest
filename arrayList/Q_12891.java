package codingtst.arrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_12891 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s1 = new StringTokenizer(br.readLine()," ");

        int S= Integer.parseInt(s1.nextToken());
        int P= Integer.parseInt(s1.nextToken());

        char[] dnaS = br.readLine().toCharArray();
        StringTokenizer s2 = new StringTokenizer(br.readLine()," ");

        int A = Integer.parseInt(s2.nextToken());
        int C = Integer.parseInt(s2.nextToken());
        int G = Integer.parseInt(s2.nextToken());
        int T = Integer.parseInt(s2.nextToken());

        int right = P-1;
        int left = 0;
        int count =0;

        int a,c,g,t;
        a=c=g=t=0;
        for (int i = 0; i < P; i++) {
            switch (dnaS[i]) {
                case 'A' : a++; break;
                case 'C' : c++; break;
                case 'G' : g++; break;
                case 'T' : t++; break;
            }
        }
        if(a>=A && c>=C && g>=G && t>=T){
            count++;
        }
        while (right<S){
            //왼쪽 배열 데이터 제거
            switch (dnaS[left]) {
                case 'A' : a--; break;
                case 'C' : c--; break;
                case 'G' : g--; break;
                case 'T' : t--; break;
            }
            left++;
            // 오른쪽 배열 데이터 추가
            right++;
            if (right!=S){
            switch (dnaS[right]) {
                case 'A' : a++; break;
                case 'C' : c++; break;
                case 'G' : g++; break;
                case 'T' : t++; break;
            }

            if(a>=A && c>=C && g>=G && t>=T){
                count++;
            }}
        }
        System.out.println(count);



    }
}
