class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length==0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0,c=0;
        while(i<g.length && j<s.length){
           if(g[i]<=s[j]){
            c++;
            i++;
            j++;
           }
           else{
              j++;
           }
        }
        return c;
    }
}