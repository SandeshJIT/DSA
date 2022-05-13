package Searching;
public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int res = binarySearch(arr, 0, arr.length-1, 6);
        System.out.println(res);
    }
    public static int binarySearch(int[] arr,int s,int e,int ele){  
        int m = (s+e)/2;
        if(s>m){
            return -1;
        }
        
        if(arr[m] == ele){
            return m;
        }
        else if(arr[m]>ele){
            return binarySearch(arr, s, m, ele);
        } 
        else{
            return binarySearch(arr, m+1, e, ele);
        }
        

    }
}

