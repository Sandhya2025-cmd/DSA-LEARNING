class Solution {
    public int arraySign(int[] nums) {
       int prod=1;
       for(int num : nums){
        if(num==0){
          prod=0;
          break;
        } 
        else if(num>0){
            num=1;
        }else{
            num=-1;
        }
        prod*=num;
       } 
       return signFunc(prod);
    }
    public int signFunc(int n){
        if(n==0){
            return 0;
        }else if(n>0){
            return 1;
        }
        return -1;
    }
}