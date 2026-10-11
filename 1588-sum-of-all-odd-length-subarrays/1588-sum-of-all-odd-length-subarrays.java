class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0,k=1,total=0;
        while(k<=arr.length){
           sum=findSum(arr,k);
           total+=sum;
           k+=2;
        }
        return total;
    }
    public int findSum(int[] nums, int k) {
        int Windowsum=0,totalSum=0;
        for(int i=0;i<k;i++){
            Windowsum+=nums[i];
        }
        for(int i=k;i<nums.length;i++){
            totalSum+=Windowsum;
            Windowsum=Windowsum-nums[i-k]+nums[i];
        }
        return totalSum+Windowsum;
    }
}