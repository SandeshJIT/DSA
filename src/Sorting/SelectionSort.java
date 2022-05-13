package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int arr[] = {16,5,47,30,25,11,870};
        sort(arr);
    }
    public static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int max = -999999;
            int j = -1;
            for(int k=0;k<arr.length-i;k++){
                if(arr[k] > max){
                    max = arr[k];
                    j = k;
                }
            }
            int temp = arr[j];
            arr[j] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
