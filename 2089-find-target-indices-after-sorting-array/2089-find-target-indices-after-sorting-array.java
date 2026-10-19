class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans=new ArrayList<>();
        int belowCount=0,count=0;
        for(int num: nums){
            if(num<target){
                belowCount++;
            }else if(num==target){
                count++;
            }
        }
        while(count!=0){
            ans.add(belowCount++);
            count--;
        }
        return ans;
    }

}