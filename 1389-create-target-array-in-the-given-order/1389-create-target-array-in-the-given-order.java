class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            a.add(index[i],nums[i]);
        }
        int target[] = new int[a.size()];
        for(int i=0;i<a.size();i++)
        {
            target[i] = a.get(i);
        }
        return target;
    }
}/*
a.add(0, 10);  // [10]
a.add(1, 20);  // [10, 20]
a.add(1, 30);  // [10, 30, 20] */