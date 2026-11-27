class Solution {
    public int findLHS(int[] nums) {
      Map<Integer,Integer> map = new HashMap<>();
      int maxLen=0,len=0;
      for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
      }
      for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i]+1)){
            len=map.get(nums[i])+map.get(nums[i]+1);
        }
        maxLen=Math.max(maxLen,len);
      } 
      return maxLen; 
    }
}