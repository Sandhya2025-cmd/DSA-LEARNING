class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int c=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]%2!=0){
            if(c==2) return true;
            else c++;
           }else{
            c=0;
           }
        }
       
        return false;
    }
}