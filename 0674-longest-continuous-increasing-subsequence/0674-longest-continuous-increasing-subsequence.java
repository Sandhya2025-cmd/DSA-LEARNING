class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int c=1,max=1;
        if(nums.length==1) return nums[0];
        for(int r=1;r<nums.length;r++){
              if(nums[r]>nums[r-1]){
                c++;
              }else{
                c=1;
              }
              max=Math.max(max,c);
        }
        return max;
    }
}