package codingtst.arrayList;

import java.util.Scanner;

public class Q_1546re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // nextInt()는 줄바꿈을 포함하지 않는다
        int N = sc.nextInt();
        sc.nextLine();
        String scoreLine = sc.nextLine();

        String[] scoreString = scoreLine.split(" ");
        int[] scores = new int[scoreString.length];

        int Max = 0;
        for (int i = 0; i < scoreString.length; i++) {

            scores[i] = Integer.parseInt(scoreString[i]);
            Max = Math.max(Max, scores[i]);
            /*
            if (scores[i] > Max) {
                Max = scores[i];
            }
            */

        }

        double sum = 0;
        //정수 나눗셈 유의사항 : 결과가 정수로 내림되니깐 형변환 해줘야함
        for (int score : scores) {
            sum += score / (double) Max * 100;
        }

        double avg = sum / N;
        System.out.println(avg);
    }
}
