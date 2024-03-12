package codingtst.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1517 {
    static long count = 0;

    static void mergeSort(int[] arr){
        int[] temp = new int[arr.length];
        mergeSort(arr,temp,0,arr.length-1);
    }
    static void mergeSort(int[] arr, int[] temp, int start, int end){
        if(start<end){
            int mid = (start+end)/2;

            mergeSort(arr, temp, start, mid);
            mergeSort(arr,temp,mid+1,end);
            merge(arr,temp,start,mid,end);

        }
    }
    static void merge(int[] arr, int[] temp, int start,int mid, int end){
        for(int i =start; i<=end;i++){
            temp[i] = arr[i];
        }
        int part1=start;
        int part2=mid+1;
        int index = start;

        while (part1<=mid && part2<=end){
            if(temp[part1]<=temp[part2]){
                arr[index]=temp[part1];
                if(index<part1) count+= part1-index;
                part1++;

            }else {
                arr[index]=temp[part2];
                if(index<part2) count+= part2-index;
                part2++;

            }
            index++;
        }
        for(int i= 0; i<=mid-part1;i++){
            arr[index+i]=temp[part1+i];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int[] arr = new int[N];
        for(int i = 0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        mergeSort(arr);
        System.out.println(count);
    }
}
