class Solution {
    public int missingInteger(int[] nums) {
        int maxsum=nums[0];
        for(int j=1;j<nums.length;j++){
            if(nums[j]==nums[j-1]+1){
                maxsum+=nums[j];
            }else{
                break;
            }
        }
        boolean[] exists=new boolean[52];
        for(int i=0;i<nums.length;i++){
            exists[nums[i]]=true;
        }
        if(maxsum>50) return maxsum;

        for(int i=maxsum;i<exists.length;i++){
            if(!exists[i]){
                return i;
            }
        }
        return 0;
    }
}