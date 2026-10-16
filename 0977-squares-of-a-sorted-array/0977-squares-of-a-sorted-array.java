class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] newArr=new int[n];
        for(int i=0;i<n;i++)
        {
            newArr[i]=nums[i]*nums[i];
        }
        Arrays.sort(newArr);
        return newArr;
    }
}