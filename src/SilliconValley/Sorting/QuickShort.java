package SilliconValley.Sorting;

import java.util.Arrays;

public class QuickShort {
    public static void main(String[] args) {
        int[] arr={-9,78,0,23,-56,70};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    //快速排序
    public static void quickSort(int[] arr,int left,int right){
        int r=right;
        int l=left;
        int temp=0;
        int pivot=arr[(left+right)/2];
        while (l<r){
            while (arr[l]<pivot){
                l+=1;
            }
            while (arr[r]>pivot){
                r-=1;
            }
            if (l>=r){
                break;
            }
            temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            if (arr[l]==pivot){
                l+=1;
            }
            if (arr[r]==pivot){
                r-=1;
            }
        }
        if (l==r){
            l+=1;
            r-=1;
        }
        if (left<r){
            quickSort(arr,left,r);
        }
        if (right>l){
            quickSort(arr,l,right);
        }
    }
}
