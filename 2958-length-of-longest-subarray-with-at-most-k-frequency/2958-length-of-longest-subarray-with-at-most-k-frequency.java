class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int l = 0;
        int maxLen = 0;

        for (int r = 0; r < nums.length; r++) {
            // Add nums[r]
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            // Shrink window if frequency exceeds k
            while (map.get(nums[r]) > k) {
                map.put(nums[l], map.get(nums[l]) - 1);
                l++;
            }
            // Current valid window length
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }
}