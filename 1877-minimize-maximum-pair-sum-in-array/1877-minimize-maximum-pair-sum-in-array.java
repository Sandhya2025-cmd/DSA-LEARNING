class Solution {
    public int minPairSum(int[] nums) {
         Arrays.sort(nums);
         int maxSum=0,n=nums.length;
         for(int i=0;i<nums.length;i++)
         {
            maxSum=Math.max(maxSum,nums[i]+nums[n-1-i]);
         }
        return maxSum;
    }
}