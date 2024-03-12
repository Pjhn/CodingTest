package codingtst.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Q_11004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");

        //배열생성
        int[] arr = new int[N];
        for(int i =0; i<N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        //quick select sort (K번째의 값 찾기 효율적)
        quickSort(arr,0,N-1,K);
        System.out.println(arr[K-1]);


    }

    //quick sort method
    static void quickSort(int[] arr, int start, int end, int K ){
        if(start>=end)return;

        int pivot =partition(arr,start,end);
        if(pivot==K-1)return;
        else if (pivot>K-1) {
            quickSort(arr, start, pivot-1,K);
        }else quickSort(arr, pivot+1, end,K);

    }

    static int partition(int[] arr, int start, int end){
        int mid = (start+end)/2;
        swap(arr,start,mid);
        int pivot = arr[start];
        int i = start+1;
        int j = end;

        while(i<=j){
            while(i<=end && arr[i]<=pivot) i++;
            while(j>start && arr[j]>=pivot) j--;

            if(i<j) swap(arr,i,j);
            else swap(arr,start,j);

        }

        return j;

    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}
