class Solution {
    public boolean canAliceWin(int n) {
      int c=1;
      int pile=n,stones=10;
      if(n<10) return false;
      while(pile>=0 && stones>=0 ){
          pile=pile-stones;
          stones--;
          if(pile>=stones){
            c++;
          }else{
            break;
          }
      } 
      return c%2==0?false:true;
    }
}