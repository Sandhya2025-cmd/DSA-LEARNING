class Solution {
    public int minimumRecolors(String blocks, int k) {
       int w=0,b=0;
       for(int i=0;i<k;i++){
        if(blocks.charAt(i)=='W'){
            w++;
        }else{
            b++;
        }
       } 
       int ops=w,minOps=w;
       for(int i=k;i<blocks.length();i++){
        if(blocks.charAt(i-k)=='W'){
            w--;
        }
        else if(blocks.charAt(i-k)=='B'){
            b--;
        }
        if(blocks.charAt(i)=='B'){
            b++;
        }
        else if(blocks.charAt(i)=='W'){
            w++;
        }  
        ops=w;  
        minOps=Math.min(ops,minOps);   
       }
       return minOps;
    }
}