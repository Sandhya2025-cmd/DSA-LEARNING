class Solution {
    public int countElements(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            boolean small=false,large=false;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    small=true;
                }
                if(nums[j]>nums[i]){
                    large=true;
                }
            }
            if(small && large) c++;
        }
        return c;
    }
}