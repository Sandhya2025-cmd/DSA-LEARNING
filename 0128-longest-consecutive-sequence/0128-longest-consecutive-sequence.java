/*

    Time Complexity : O(N), Although the time complexity appears to be quadratic due to the while loop nested
    within the for loop, closer inspection reveals it to be linear. Because the while loop is reached only when
    marks the beginning of a sequence (i.e. currentNumber-1 is not present in nums), the while loop can only run
    for N iterations throughout the entire runtime of the algorithm. This means that despite looking like O(N^2)
    complexity, the nested loops actually run in O(N+N)=O(N) time. All other computations occur in constant
    time, so the overall runtime is linear. Where N is the size of the Array(nums).

    Space Complexity : O(N), Unordered set space.
*/

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