class Solution {
    public int maxArea(int[] height) {
      int l=0,r=height.length-1,area=0,maxArea=0;
      while(l<r){
        if(height[l]<=height[r]){
            area=height[l]*(r-l);
            l++;
        }else{
            area=height[r]*(r-l);
            r--;
        }
        maxArea=Math.max(area,maxArea);
      }
      return maxArea; 
    }
}