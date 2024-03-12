package codingtst.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_1377 {
    /* 버블 정렬은 외부정렬과 내부정렬로 진행됩니다. 주어진 코드에서는 내부정렬이 이루어지지 않을경우
    외부정렬을 한 횟수를 출력합니다. 내부정렬 한번에 각 요소가 최대 앞으로 한 칸만 이동할 수 있습니다
    따라서 정렬 전, 후의 각 요소에 대한 인덱스를 비교했을 때 인덱스 차이의 최댓값 만큼 내부정렬이
    실행됐음을 알 수 있습니다. 문제에서는 외부정렬 사이클을 한 번 더 돌려 change의 값이 false인 것을
    확인하고 출력이 되므로 인덱스 차이 최댓값에 1을 더해줘야합니다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Idxarr[] arr = new Idxarr[N];
        for(int i = 0; i<N; i++){
            arr[i] = new Idxarr(i,Integer.parseInt(br.readLine()));
        }

        Arrays.sort(arr);

        int Max = -1;

        for(int j=0; j<arr.length; j++){
            if(Max < arr[j].index-j)
                Max = arr[j].index-j;
        }
        System.out.println(Max+1);

    }
}
class Idxarr implements Comparable<Idxarr>{
    int index;
    int value;

    Idxarr(int index, int value){
        this.index = index;
        this.value = value;
    }

    @Override
    public int compareTo(Idxarr o) {
        return value - o.value;
    }
}
