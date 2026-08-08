class Solution {
    public int maxOperations(int[] nums) {
        int ops=0,score=nums[0]+nums[1],sum=0;
       for(int i=1;i<nums.length;i+=2){
          sum=nums[i]+nums[i-1];
          if(sum==score){
            ops++;
          }
          else{
            break;
          }
       }
       return ops;
    }
}