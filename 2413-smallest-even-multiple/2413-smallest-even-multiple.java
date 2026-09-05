class Solution {
    public int smallestEvenMultiple(int n) {
        return 2*n/gcd(2,n);
    }
    public int gcd(int x,int y){
        if(y==0){
            return x;
        }
        return gcd(y,x%y);
    }
}