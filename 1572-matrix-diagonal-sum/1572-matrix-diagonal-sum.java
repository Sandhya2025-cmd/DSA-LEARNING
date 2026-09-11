class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length,sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<mat[0].length;j++){
                sum+=mat[i][j];
                if(i==j || i+j==n-1){
                    continue;
                }else{
                    sum-=mat[i][j];
                }
            }
        }
        return sum;
    }
}