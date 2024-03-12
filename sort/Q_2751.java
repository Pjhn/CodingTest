package codingtst.sort;

import java.io.*;
import java.util.Arrays;

public class Q_2751 {
    static void mergeSort(int[] arr){
        int[] temp = new int[arr.length];
        mergeSort(arr,temp,0,arr.length-1);
    }

    static void mergeSort(int[] arr, int[] temp, int start, int end){
        if(start<end){
            int mid = (start+end)/2;
            mergeSort(arr, temp, start, mid);
            mergeSort(arr, temp, mid+1, end);
            merge(arr,temp,start,end, mid);
        }
    }

    static void merge(int[] arr, int[] temp, int start, int end, int mid){
        for(int i =start; i<=end; i++){
            temp[i] = arr[i];
        }
        int part1= start;
        int part2= mid+1;
        int index = start;

        while(part1<=mid && part2<=end){
            if(temp[part1]<= temp[part2]){
                arr[index] = temp[part1];
                part1++;
            }
            else {
                arr[index] = temp[part2];
                part2++;
            }
            index++;
        }
        for(int i =0; i<=mid-part1; i++){
            arr[index+i] = temp[part1+i];
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for(int i =0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        mergeSort(arr);
        for(int n : arr) bw.write(n+"\n");
        bw.flush();
        bw.close();
    }
}
