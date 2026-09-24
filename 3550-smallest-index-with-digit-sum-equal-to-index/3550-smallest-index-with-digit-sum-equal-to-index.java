class Solution {
    public int smallestIndex(int[] nums) {
        int minIdx=Integer.MAX_VALUE;
         for(int i=0;i<nums.length;i++){
            int ans=0;
           while(nums[i]!=0){
            ans=ans+nums[i]%10;
            nums[i]/=10;
           }
           if(i==ans){
            minIdx=Math.min(i,minIdx);
           }
        }
     return minIdx==Integer.MAX_VALUE?-1:minIdx;
    }
}