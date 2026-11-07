class Solution {
    public boolean canBeIncreasing(int[] nums) {
       boolean flag;
       for(int i=0;i<nums.length;i++){
        List<Integer> arr = new ArrayList<>();
         for(int j=0;j<nums.length;j++){
            if(j==i){
                continue;
            }
            arr.add(nums[j]);
         }
    
         if(isSorted(arr)){
            return true;
         }
       }
       return false;
    }
    private boolean isSorted(List<Integer> arr){
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)>=arr.get(i+1)){
                return false;
            }
        }
        return true;
    }
}