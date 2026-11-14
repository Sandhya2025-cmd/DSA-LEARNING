class Solution {
    public boolean validPalindrome(String s) {
      int n=s.length(),c=0;
      int l=0,r=n-1;
      while(l<r){
        if(s.charAt(l)!=s.charAt(r)){
          return isPalindromic(s,l+1,r) || isPalindromic(s,l,r-1);
        }else{
        l++;
        r--;
        }
      }
      return true;
    }
    private boolean isPalindromic(String s, int l,int r){
        while(l<r){
            if(s.charAt(l++)!=s.charAt(r--)){
                return false;
            }
        }
        return true;
    }
}