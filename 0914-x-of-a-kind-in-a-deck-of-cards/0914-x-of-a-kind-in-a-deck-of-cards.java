class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<deck.length;i++){
            map.put(deck[i],map.getOrDefault(deck[i],0)+1);
        }
        int gcd=0;
        for(int count:map.values()){
            gcd=findGCD(gcd,count);
        }
       return gcd>=2;
    }

    private int findGCD(int a, int b) {
        if (a == 0) return b;
        return findGCD(b % a, a);
    }
}