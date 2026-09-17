class Solution {
    public int mostWordsFound(String[] sentences) {
       
        int max = 0;
        for(String ch : sentences){
            int currLen = ch.split(" ").length;
            max=Math.max(max,currLen);
        }
        return max;
    }
}