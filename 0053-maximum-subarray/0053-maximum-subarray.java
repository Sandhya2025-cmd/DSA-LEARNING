class Solution {
    public int maxSubArray(int[] nums) {
        int csum=0,sum=Integer.MIN_VALUE;
        for(int num:nums){
            csum+=num;
            sum=Math.max(csum,sum);
            if(csum<0){
                csum=0;
            }
        }
        return sum;
    }
}