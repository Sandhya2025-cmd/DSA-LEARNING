class Solution {
    public boolean checkString(String s) {
    //     int idx=s.indexOf('b');
    //   for(int i=idx;i<s.length();i++){
    //     if(s.charAt(i)=='a'){
    //         return false;
    //     }
    //   } 
      if(s.contains("ba")){
        return false;
      }
      return true; 
    }
}