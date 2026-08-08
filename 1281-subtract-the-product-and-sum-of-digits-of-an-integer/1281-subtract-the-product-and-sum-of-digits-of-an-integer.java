class Solution {
    public int subtractProductAndSum(int n) {
     int sum=0,prod=1;
     int num=n;
     while(num!=0){
        int d=num%10;
        prod*=d;
        sum+=d;
        num/=10;
     } 
     return prod-sum;  
    }
}