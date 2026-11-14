class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int sum,min_sum=Integer.MAX_VALUE;
        while(l<=r){
            sum=0;
            for(int i=0;i<l;i++){
               sum+=nums.get(i);
            }
            if(sum>0){
                min_sum=Math.min(sum,min_sum);
            } 
            for(int i=l;i<nums.size();i++){               
                sum=sum+nums.get(i)-nums.get(i-l);
                if(sum>0){
                   min_sum=Math.min(sum,min_sum);
                } 
            }
            l++;
        }      
        return min_sum==Integer.MAX_VALUE ? -1 : min_sum;
    }
}