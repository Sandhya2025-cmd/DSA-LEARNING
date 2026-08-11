class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr=new int[2];
        int k=0,xor;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
               xor=nums[i]^nums[j];
               if(xor==0){
                  arr[k++]=nums[i];
                }
            }
        }
        return arr;
    }
}