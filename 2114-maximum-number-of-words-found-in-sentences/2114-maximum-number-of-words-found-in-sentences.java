class Solution {
    public int mostWordsFound(String[] sentences) {
        String[] words = new String[101];
        int max = 0;
        for(String ch : sentences){
            words = ch.split("\\s+");
            max=Math.max(max,words.length);
        }
        return max;
    }
}