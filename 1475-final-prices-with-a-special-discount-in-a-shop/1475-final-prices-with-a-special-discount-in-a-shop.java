class Solution {
    public int[] finalPrices(int[] prices) {
      int[] dis = new int[prices.length];
      for(int i=0;i<prices.length;i++){
            boolean  flag=false;
            for(int j=i+1;j<prices.length;j++){
                 if(prices[j]<=prices[i]){
                    dis[i]=prices[i]-prices[j];
                    flag=true;
                    break;
                 }
            }
            if(!flag) dis[i]=prices[i];    
         }
         return dis;
    }
}