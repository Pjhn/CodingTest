package codingtst.arrayList;

import java.util.Scanner;

public class Q_1546 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // nextInt()는 줄바꿈을 포함하지 않는다
        int N = sc.nextInt();
        sc.nextLine();
        String score = sc.nextLine();

        String[] bfs= score.split(" ");
        int[] bfsInt = new int[bfs.length];

        int Max = 0;
        for(int i =0; i < bfs.length; i++){
            bfsInt[i] = Integer.parseInt(bfs[i]);
            if(bfsInt[i]>Max){
                Max = bfsInt[i];
            }
        }

        double sum = 0;
        //정수 나눗셈 유의사항 : 결과가 정수로 내림되니깐 형변환 해줘야함
        for(int s : bfsInt){
            sum += s/(double)Max*100;
        }

        double avg = sum/N;
        System.out.println(avg);

    }
}
