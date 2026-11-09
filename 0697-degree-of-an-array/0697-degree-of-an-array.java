class Solution {
    public int findShortestSubArray(int[] A) {
        int[] count = new int[50000];
        int[] first = new int[50000];
        Arrays.fill(first,-1);
        int res = 0, degree = 0;
        for (int i = 0; i < A.length; i++) {
            if(first[A[i]]==-1){
              first[A[i]]=i;
            }
            count[A[i]]++;
            if (count[A[i]] > degree) {
                degree = count[A[i]];
                res = i - first[A[i]]+1;
            } else if (count[A[i]]== degree)
                res = Math.min(res, i - first[A[i]]+1);
        }
        return res;
    }
}