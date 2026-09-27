class Solution {
    public int getMaximumGenerated(int n) {
        if (n == 0 || n == 1) return n;
        int[] nums = new int[n+1];
        int max=0;
        if(nums.length>1) nums[1]=1;
        for(int i=1;i<=n;i++){
            if(2*i>=2 && 2*i<=n ){
                nums[2*i]=nums[i];
            }
            if(2*i+1 >=2 && 2*i+1<=n){
                nums[2*i+1]=nums[i]+nums[i+1];
            }
            if(nums[i]>max){
                max=nums[i];
            }
        }
        // for(int num:nums){
        //     if(num>max){
        //         max=num;
        //     }
        // }
        return max;
    }
}