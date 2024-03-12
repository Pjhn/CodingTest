package codingtst.arrayList;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q_11003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer s1 = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(s1.nextToken());
        int L = Integer.parseInt(s1.nextToken());

        StringTokenizer s2 = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();

        Deque<Input> window = new LinkedList<>();

        for(int i=1; i<=N; i++){
            Input newNum = new Input(i,Integer.parseInt(s2.nextToken()));

            if(!window.isEmpty() && window.peekFirst().index<=i-L) {
                window.pollFirst();
            }
            while(!window.isEmpty() && newNum.value<window.peekLast().value)
            window.pollLast();

            window.offerLast((newNum));
            sb.append(window.peekFirst().value).append(" ");

        }
        System.out.print(sb);
    }
}

class Input {
    int index;
    int value;

    Input(int index, int value){
        this.index = index;
        this.value = value;
    }
}