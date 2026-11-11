class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int c=0;
        for(String ch: patterns){
            if(word.contains(ch)){
                c++;
            }
        }
        return c;
    }
}