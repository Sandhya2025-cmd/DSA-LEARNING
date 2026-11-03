class Solution:
    def minMoves(self, nums: List[int]) -> int:
        maxEle=max(nums)
        sum=0
        for i in range(len(nums)):
            sum+=maxEle-nums[i]
        return sum


        