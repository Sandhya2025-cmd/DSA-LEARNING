class Solution {
    public int minimumSwaps(int[] nums) {
       int i=0,j=nums.length-1,c=0;
       while(i<j){
        if(nums[i]==0){
          if(nums[j]!=0){
            swap(nums,i,j);
            i++;
            j--;
            c++;
          }else{
            j--;
          }
        }else{
           i++;
        }
       } 
       return c;
    }
    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}