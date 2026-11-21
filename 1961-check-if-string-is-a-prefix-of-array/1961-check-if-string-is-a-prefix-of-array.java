class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int i=0,j=0;
        String str="";
        for(String word: words){
            str=str+word;
            if(str.equals(s)){
                return true;
            }
        }
        return false;
    }
}