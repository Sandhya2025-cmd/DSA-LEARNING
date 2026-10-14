class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        Set<Character> map = new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            map.add(allowed.charAt(i));
        }
        int count=0;
        for(int i=0;i<words.length;i++){
           String word=words[i];
           boolean flag=true;
           for(char ch : word.toCharArray()){
            if(!map.contains(ch)) flag=false;
           }
           if(flag) count++;
        }
        return count;
    }
}