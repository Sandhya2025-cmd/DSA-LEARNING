class Solution {
    public int[] sumZero(int n) {
      int[] arr = new int[n];
      int sum = -(n*(n-1)/2);
      arr[0]=sum;
      for(int i=1;i<n;i++){
        arr[i]=i;
      }
      
      return arr;
    }
}