class Solution {
    public boolean checkDivisibility(int n) {
       int digSum=0,digProd=1,sum=0;
       int ogNum=n;
       while(n>0){
        int r=n%10;
        digSum+=r;
        digProd*=r;
        n=n/10;
       }
       sum=digSum+digProd;
       if(ogNum % sum == 0){
        return true;
       }
       return false;
    }
}