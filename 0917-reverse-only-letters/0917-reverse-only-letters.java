class Solution {
    public String reverseOnlyLetters(String s) {
        int l=0,r=s.length()-1;
        char[] ch = s.toCharArray();
        while(l<r){
            if((ch[l]>='a' && ch[l]<='z') || (ch[l]>='A' && ch[l]<='Z')){
               if((ch[r]>='a' && ch[r]<='z') || (ch[r]>='A' && ch[r]<='Z')){
                 char temp = ch[l];
                 ch[l]=ch[r];
                 ch[r]=temp;
                 l++;
                 r--;
               }else{
                r--;
               }
            }else{
                l++;
            }
        }
        return new String(ch);
    }
}