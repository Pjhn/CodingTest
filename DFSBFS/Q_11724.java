package codingtst.DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q_11724 {
    static HashSet<Integer> numSet = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Node[] nodes = new Node[N+1];
        for (int i = 1; i <= N; i++) {
            nodes[i] = new Node(i);
            numSet.add(i);
        }

        while(M-->0){
            st = new StringTokenizer(br.readLine()," ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            numSet.add(u); numSet.add(v);

            nodes[u].link.add(nodes[v]);
            nodes[v].link.add(nodes[u]);
        }

        int count = 0;
        while (!numSet.isEmpty()){
            int find_num = numSet.iterator().next();
            DFS(nodes[find_num]);
            count++;
        }

        System.out.println(count);
    }

    static void DFS(Node n){
        if (n == null) return;
        n.cheak = true;
        numSet.remove(n.num);
        for(Node l : n.link){
            if(l.cheak == false)
                DFS(l);
        }

    }

}

class Node {
    int num;
    boolean cheak = false;
    LinkedList<Node> link ;
    Node(int num){
        this.num = num;
        link = new LinkedList<>();
    }
}
