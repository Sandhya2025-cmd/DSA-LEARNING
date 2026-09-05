class Solution {
    public int findGCD(int[] nums) {
        int s=Integer.MAX_VALUE,lar=Integer.MIN_VALUE;
        for(int num : nums){
            if(num>lar){
                lar=num;
            }
            if(num<s){
                s=num;
            }
        }
        return gcd(s,lar);
    }
    public int gcd(int x,int y){
        if(y==0){
            return x;
        }
        return gcd(y,x%y);
    }
}