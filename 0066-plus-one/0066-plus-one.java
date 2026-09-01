class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
         for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            //not less than 9 means it must be equal to 9 so change it to 0
            digits[i]=0;
         }
         //if all digits are 9
         digits = new int[n+1]; //[0,0,0,0]
         digits[0]=1;  //[1,0,0,0]
        
        return digits;
    }
}