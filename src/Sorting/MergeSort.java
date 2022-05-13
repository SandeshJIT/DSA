package Sorting;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) throws Exception {
        int[] arr = {5,4,3,2,1};
        int[] res = mergeSort(arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int m = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,m));
        int[] right = mergeSort(Arrays.copyOfRange(arr,m,arr.length));
        return merge(left,right);
    }
    public static int[] merge(int[] left, int[] right) {
        int i=0;
        int j=0;
        int k=0;
        int res[] = new int[left.length + right.length];
        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                res[k] = left[i];
                i++;
            }
            else{
                res[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            res[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length){
            res[k] = right[j];
            j++;
            k++;
        }
        return res;
    }
}
