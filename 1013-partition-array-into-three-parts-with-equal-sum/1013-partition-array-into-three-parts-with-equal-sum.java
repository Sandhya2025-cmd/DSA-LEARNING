class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int n=arr.length;
        int sum=0,firstSum=0,part=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        firstSum=sum/3;
        int j=0,c=0;
        while(j<n){
            part+=arr[j];
            if(part==firstSum){
                c++;
                part=0;
            }
            j++;
        }
        return c>=3 && sum%3==0;
    }
}