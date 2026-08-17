class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]<min){
                min=nums[i]-nums[i-1];
            }
        }
        for(int j=1;j<nums.length;j++){
            if(nums[j]-nums[j-1] == min){
                ans.add(Arrays.asList(nums[j-1],nums[j]));
            }
        }
        return ans;
    }
}