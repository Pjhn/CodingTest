package codingtst.stackqueue;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Stack;

public class Q_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        long sum =0;

        Stack<Integer> stack = new Stack<>();

        for(int i =0; i<K; i++){
            int n = Integer.parseInt(br.readLine());
            if(n==0 && stack.size()>0){
                stack.pop();
            }else stack.push(n);
        }

        Iterator it = stack.iterator();
        while (it.hasNext()){
            sum+=(int)it.next();
        }

        System.out.println(sum);
    }
}
