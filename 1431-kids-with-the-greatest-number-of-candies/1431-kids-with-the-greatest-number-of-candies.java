class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       List<Boolean> lst = new ArrayList<>();
       int max = Integer.MIN_VALUE;
       for(int num : candies){
         if(num>max){
            max=num;
         }
       }
       for(int num : candies){
        if(num+extraCandies>=max){
            lst.add(true);
        }else{
            lst.add(false);
        }
       }
       return lst;
    }
}