package SilliconValley.Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,8,10,89,1000,1234};
        int i=binarySearch(arr,0,arr.length-1,10);
        System.out.println(i);
    }

    public static int binarySearch(int[] arr,int left,int right,int findVal){
        if (left>right){
            return -1;
        }
        int mid=(left+right)/2;
        int midVal=arr[mid];
        if (findVal<midVal){
            return binarySearch(arr,left,mid-1,findVal);
        }else if (findVal>midVal){
            return binarySearch(arr,mid+1,right,findVal);
        }else {
            return mid;
        }
    }
}
