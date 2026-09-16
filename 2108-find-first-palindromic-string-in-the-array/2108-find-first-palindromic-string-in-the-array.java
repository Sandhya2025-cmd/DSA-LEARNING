class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            if(isPalindromic(words[i])){
                return words[i];
            }
        }
        return "";
    }
    public boolean isPalindromic(String word){
        int i=0,n=word.length();
        while(i<n/2){
            if(word.charAt(i)!=word.charAt(n-1-i)){
                return false;
            }
            i++;
        }
        return true;
    }
}