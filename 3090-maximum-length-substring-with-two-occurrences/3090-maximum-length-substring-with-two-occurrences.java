class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int l=0,max=1,c=0;
        for(int r=0;r<s.length();r++){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            while(map.get(s.charAt(r))>2){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}