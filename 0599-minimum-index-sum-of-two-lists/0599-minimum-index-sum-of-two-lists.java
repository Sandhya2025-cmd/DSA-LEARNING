class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        List<String> res = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> common = new HashMap<>();
        int minInd=Integer.MAX_VALUE;
       for(int i=0;i<list1.length;i++){
          map.put(list1[i],i);
        }
        for(int i=0;i<list2.length;i++){
             Integer ind=map.get(list2[i]);
             if(ind!=null && ind+i<=minInd){
                if(ind+i<minInd){
                    res.clear();
                    minInd=ind+i;
                }
                res.add(list2[i]);
             }
        }
       return res.toArray(new String[res.size()]); 
    }
}