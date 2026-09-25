class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int cnt=0,n=nums.length;
        for(int i=0;i<nums.length-2;i++){
            if(contains(nums,nums[i]+diff) && contains(nums,nums[i]+ 2*diff)){
                cnt++;
            }
        }
        return cnt;
    }
    public boolean contains(int[] nums,int target){
        for(int num: nums){
            if(num==target) return true;
        }
        return false;
    }
}