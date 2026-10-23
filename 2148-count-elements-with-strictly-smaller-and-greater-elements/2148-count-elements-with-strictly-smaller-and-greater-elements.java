class Solution {
    public int countElements(int[] nums) {
        int c=0;
        int max=nums[0],min=nums[0];
        for(int num:nums){
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
        }
        for(int e:nums){
            if(e>min && e<max){
                c++;
            }
        }
        return c;
    }
}