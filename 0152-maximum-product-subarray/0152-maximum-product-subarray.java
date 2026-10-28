class Solution {
    public int maxProduct(int[] nums) {
        int max_prod=Integer.MIN_VALUE,prod=1,max_prod2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            prod*=nums[i];
            max_prod=Math.max(prod,max_prod);
            if(prod==0){
                prod=1;
            }
        }  
        prod=1; 
        for(int i=nums.length-1;i>=0;i--){
            prod*=nums[i];
            max_prod2=Math.max(prod,max_prod2);
            if(prod==0){
                prod=1;
            }
        }    
        return Math.max(max_prod,max_prod2); 
    }
}