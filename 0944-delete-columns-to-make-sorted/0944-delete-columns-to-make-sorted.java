class Solution {
    public int minDeletionSize(String[] strs) {

        int col=0;
        for(int i=0;i<strs[0].length();i++){
            boolean flag=true;
            for(int j=0;j<strs.length-1;j++){
                String curr=strs[j];
                String next=strs[j+1];
                if(curr.charAt(i)-'a'>next.charAt(i)-'a'){
                    flag=false;
                }
            }
            if(!flag) col++;
        }
        return col;       
    }
}