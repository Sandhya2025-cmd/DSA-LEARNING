class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int cnt=right-left+1;
        for(int n=left;n<=right;n++){
            for(int j=0;j<ranges.length;j++){
                if(n>=ranges[j][0] && ranges[j][1]>=n){
                    cnt--;
                    break;
                }
            }
        }
       return cnt==0 ? true:false;
    }
}