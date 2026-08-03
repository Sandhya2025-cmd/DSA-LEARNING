class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0,sum=0;
        for(int i=0;i<jewels.length();i++){
            count=0;
           for(int j=0;j<stones.length();j++){
             if(stones.charAt(j)==jewels.charAt(i)){
                count++;
             }
           }
           sum+=count;
        }
        return sum;
    }
}