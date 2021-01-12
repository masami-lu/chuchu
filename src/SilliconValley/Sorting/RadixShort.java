package SilliconValley.Sorting;

import java.util.Arrays;

public class RadixShort {
    public static void main(String[] args) {
        int[] arr={56,3,542,748,14,214};
        radixShort(arr);
    }

    public static void radixShort(int[] arr){
        int max=arr[0];
        for (int m=0;m<arr.length;m++){
            if (max<arr[m]){
                max=arr[m];
            }
        }
        int maxLength=(max+"").length();

        int[][] bucket=new int[10][arr.length];
        int[] bucketEleCounts=new int[10];

        for (int i=0, n=1;i<maxLength;i++,n*=10){
            for (int j=0;j<arr.length;j++){
                int digitOfEle=arr[j]/n%10;
                bucket[digitOfEle][bucketEleCounts[digitOfEle]]=arr[j];
                bucketEleCounts[digitOfEle]++;
            }

            int index=0;
            for (int k=0;k<bucket.length;k++){
                if (bucketEleCounts[k]!=0){
                    for (int l=0;l<bucketEleCounts[k];l++){
                        arr[index++]=bucket[k][l];
                    }
                }
                bucketEleCounts[k]=0;
            }
            System.out.println(Arrays.toString(arr));
        }

    }
}
