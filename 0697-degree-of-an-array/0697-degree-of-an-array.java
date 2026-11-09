class Solution {
    public int findShortestSubArray(int[] nums) {
        int[] count = new int[50000];
        Map<Integer,Integer> first = new HashMap<>();
        int res=0,degree=0;

        for(int i=0;i<nums.length;i++){
          first.putIfAbsent(nums[i],i);
          count[nums[i]]++;
          if(count[nums[i]]>degree){
            degree=count[nums[i]];
            res=i-first.get(nums[i])+1;
          }
          else if(count[nums[i]]==degree){
            res=Math.min(i-first.get(nums[i])+1,res);
          }
        }

        return res;
    }
}