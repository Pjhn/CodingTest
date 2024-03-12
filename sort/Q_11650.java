package codingtst.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q_11650 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st ;
        ArrayList<int[]> list = new ArrayList<>();

        for(int i =0; i<N; i++){
            int[] arr = new int[2];
            st = new StringTokenizer(br.readLine()," ");
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            list.add(arr);
        }

        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0])
                    return o1[1]-o2[1];
                else {
                    return o1[0]-o2[0];
                }
            }
        });

        //출력
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<N; i++){
            sb.append(list.get(i)[0]+" ").append(list.get(i)[1]+"\n");
        }

        System.out.println(sb);

    }
}
