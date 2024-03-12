package codingtst.DFSBFS;

import java.util.Scanner;

public class Q_2023 {
    static int M;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        M= sc.nextInt();

        DFS(2,1);
        DFS(3,1);
        DFS(5,1);
        DFS(7,1);

        System.out.println(sb);


    }

    static void DFS(int number, int jarisu){
        if(jarisu == M){
            if(sosu(number)){
                sb.append(number).append("\n");
                return;
            }
        }

        for(int i =1; i<=9; i++){
            if( sosu(number*10+i)){
                DFS(number*10+i, jarisu+1);
            }else continue;
        }
    }

    static boolean sosu(int number){
        for(int i = 2; i<=number/2; i++){
            if(number%i == 0) return false;
        }
        return true;
    }
}
