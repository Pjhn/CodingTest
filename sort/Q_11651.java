package codingtst.sort;

import javax.swing.text.html.HTMLDocument;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q_11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Coordinate> list = new ArrayList<>(N);

        StringTokenizer st ;

        for(int i =0; i<N; i++){
            st =new StringTokenizer(br.readLine()," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            Coordinate c = new Coordinate(x,y);
            list.add(c);
        }

        Collections.sort(list);
        Iterator it = list.iterator();

        StringBuilder sb = new StringBuilder();

        while(it.hasNext()){
            Coordinate cd = (Coordinate) it.next();
            sb.append(cd.x).append(" ").append(cd.y+" \n");
        }

        System.out.println(sb);
    }
}

class Coordinate implements Comparable<Coordinate>{
    int x; int y;

    Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Coordinate o) {
        if(this.y == o.y) {
            return this.x-o.x;
        }else {
            return this.y-o.y;
        }
    }

}
