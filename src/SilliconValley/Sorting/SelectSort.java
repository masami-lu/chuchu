package SilliconValley.Sorting;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr={101,1,34,98};
        selectSort(arr);
    }

    public static void selectSort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            int minIndex=i;
            int min=arr[i];
            for (int j=i+1;j<arr.length;j++){
                if (min>arr[j]){
                    minIndex=j;
                    min=arr[j];

                }
            }
            if (arr[minIndex]!=arr[i]){
                arr[minIndex]=arr[i];
                arr[i]=min;
            }
            System.out.println("the no"+(i+1)+"turns");
            System.out.println(Arrays.toString(arr));
        }
    }
}
