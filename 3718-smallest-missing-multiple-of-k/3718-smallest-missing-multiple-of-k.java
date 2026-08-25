class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean[] exist = new boolean[101];
        for(int num : nums){
            exist[num]=true;
        }
        int i=k;
        for(;i<exist.length;i+=k){
            if(!exist[i]){
                return i;
            }
        }
        return i;
    }
}