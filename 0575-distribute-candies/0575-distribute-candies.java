class Solution {
    public int distributeCandies(int[] candyType) {
    Arrays.sort(candyType);
    int n=candyType.length;
    int len= countUniqCandies(candyType);
    if(len<=(n/2)){
         return len;
    }
    return n/2;
    }
    public int countUniqCandies(int[] candyType){
        int j=1;
        for(int i=1;i<candyType.length;i++){
            if(candyType[i]!=candyType[i-1]){
                candyType[j]=candyType[i];
                j++;
            }
        }
        return j;
    }
}