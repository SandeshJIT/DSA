package Sorting;

import java.util.Arrays;


public class QuickSort {
    public static void main(String[] args){
        int[] arr = {5,4,3,2,1};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr,int s,int e){
        if(s>e){
            return;
        }
        
        int p = arr[((s+e)/2)];
        int i =s;
        int j=e;
        while(i<=j){
            while(arr[i] < p){
                i++;
            }
            while(arr[j] > p){
                j--;
            }
            if(i<=j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;    
            }
            
            
        }
        quickSort(arr, s, j);
        quickSort(arr, i, e);


    }
}
