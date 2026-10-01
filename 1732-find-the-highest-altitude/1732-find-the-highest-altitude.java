class Solution {
    public int largestAltitude(int[] gain) {
        int maxHeight=0,altitude=0;
        for(int i=0;i<gain.length;i++){
            altitude+=gain[i];
            maxHeight=Math.max(maxHeight,altitude);
        }
        return maxHeight;
    }
}