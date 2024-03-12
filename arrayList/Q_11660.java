package codingtst.arrayList;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s1 = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();

        int size = Integer.parseInt(s1.nextToken());
        long question =  Integer.parseInt(s1.nextToken());

        int[][] Arr = new int[size+1][size+1];
        int[][] sumArr = new int[size+1][size+1];

        //표 만들기
        for(int i=1; i<=size; i++){
            StringTokenizer s2 = new StringTokenizer(br.readLine()," ");
            for(int j=1; j<=size; j++){
                Arr[i][j] = Integer.parseInt(s2.nextToken());
            }
        }//end for

        // 합집합 로직
        for(int i=1; i<=size; i++){
            for(int j=1; j<=size; j++){
                sumArr[i][j] = sumArr[i-1][j] + sumArr[i][j-1] - sumArr[i-1][j-1] + Arr[i][j];
            }
        }

        for(int i =0; i<question;i++){
            StringTokenizer s3 = new StringTokenizer(br.readLine()," ");

            int x1 = Integer.parseInt(s3.nextToken());
            int y1 = Integer.parseInt(s3.nextToken());
            int x2 = Integer.parseInt(s3.nextToken());
            int y2 = Integer.parseInt(s3.nextToken());

            sb.append(sumArr[x2][y2]-sumArr[x1-1][y2]-sumArr[x2][y1-1] + sumArr[x1-1][y1-1]+"\n");

        }
        System.out.println(sb);
    }//Main
}

