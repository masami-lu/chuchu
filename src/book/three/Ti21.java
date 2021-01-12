package book.three;

public class Ti21 {
    public int[] exchange(int[] nums) {
        int i=0,j=nums.length-1,temp;
        while (i<j){
            while (nums[j]%2==0){
                j--;
            }
            if (nums[i]%2==0){
                temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }else {
                i++;
            }
        }
        return nums;
    }
}
