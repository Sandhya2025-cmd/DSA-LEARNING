class Solution {
    public int maxAscendingSum(int[] nums) {
       int l=0,sum=nums[0],maxSum=nums[0];
       for(int r=1;r<nums.length;r++){
          sum=nums[r]>nums[r-1] ? sum+=nums[r] : nums[r];
          maxSum=Math.max(sum,maxSum);
        }
         
       return maxSum;
    }
}