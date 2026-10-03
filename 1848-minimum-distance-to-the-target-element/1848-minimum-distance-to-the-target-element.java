class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int minIdx=Integer.MAX_VALUE;
        int l=0,r=nums.length-1;
        while(l<=r){
            if(nums[l]==target){
                minIdx=Math.min(minIdx,Math.abs(l-start));
            }
            if(nums[r]==target){
                minIdx=Math.min(minIdx,Math.abs(r-start));
            }
            l++;
            r--;
        }
        return minIdx;
    }
}