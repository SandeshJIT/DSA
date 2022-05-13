package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {10,6,5,11,15,23,1,20};
        int[] res = bubbleSort(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] bubbleSort(int[] arr) {
        for(int i=arr.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                int temp;
                if(arr[j]>arr[i]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
                System.out.println(i+" "+Arrays.toString(arr));
            }
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
}
