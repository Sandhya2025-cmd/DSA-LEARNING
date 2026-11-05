class Solution {
    public int minDeletionSize(String[] strs) {

        int col=0;
        for(int i=0;i<strs[0].length();i++){
            boolean flag=true;
            for(int j=0;j<strs.length-1;j++){
                if(strs[j].charAt(i)-'a'>strs[j+1].charAt(i)-'a'){
                    col++;
                    break;
                }
            }
        }
        return col;       
    }
}