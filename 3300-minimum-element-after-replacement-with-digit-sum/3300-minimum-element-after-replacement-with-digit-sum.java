class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int n=nums[i],sum=0;
          while(n!=0){
            int d=n%10;
            sum+=d;
            n/=10;
          }
          nums[i]=sum;
        }
        for(int num:nums){
            if(num<min){
                min=num;
            }
        }
        return min;
    }
}