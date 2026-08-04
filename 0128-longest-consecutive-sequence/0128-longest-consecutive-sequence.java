class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int len=0,c=0;
        for(int item : set){
            if(!set.contains(item-1)){
                int num=item;
                c=1;
                while(set.contains(num+1)){
                    c++;
                    num++;
                }
                len=Math.max(len,c);
            }
        }
        return len;
    }
}