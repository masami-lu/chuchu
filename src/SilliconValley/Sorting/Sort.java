package SilliconValley.Sorting;

import java.sql.Array;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int arr[]={3,9,-1,10,-2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //冒泡排序
    public static void bubbleSort(int[] arr){
        int temp=0;
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j] > arr[j+1]) {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
