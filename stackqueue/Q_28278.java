package codingtst.stackqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q_28278 {

    static Stack<Integer> stack = new Stack<>();
    static StringBuilder sb =new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        int order = 1;
        while(order<=N ){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int o = Integer.parseInt(st.nextToken());

            switch (o){
                case 1:  int x = Integer.parseInt(st.nextToken()); caseOne(x); break;
                case 2: caseTwo(); break;
                case 3: caseThree(); break;
                case 4: caseFour(); break;
                case 5: caseFive(); break;
            }
            order++;
        }
        System.out.println(sb);

    }

    static void caseOne(int x){
        stack.push(x);
    }

    static void caseTwo(){
        if(!stack.isEmpty()){
            sb.append(stack.pop()).append("\n");
        }else sb.append(-1).append("\n");
    }

    static void caseThree(){
        sb.append(stack.size()).append("\n");
    }

    static void caseFour(){
        if(!stack.isEmpty()){
            sb.append(0).append("\n");
        }else sb.append(1).append("\n");
    }

    static void caseFive(){
        if(!stack.isEmpty()){
            sb.append(stack.peek()).append("\n");
        }else sb.append(-1).append("\n");
    }
}
