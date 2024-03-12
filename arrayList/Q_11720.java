package codingtst.arrayList;

import java.util.Scanner;

public class Q_11720 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();

        int sum = 0;
        char[] temp = sNum.toCharArray();

        for (char c : temp) {
            sum += (int) c - 48;
        }
        System.out.println(sum);
    }
}
