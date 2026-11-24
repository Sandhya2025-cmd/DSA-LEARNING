class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> s = new HashSet<>();
        for(List<String> path: paths){
            s.add(path.get(0));
        }
        for(List<String> path: paths){
            if(!s.contains(path.get(1))){
                return path.get(1);
            }
        }
        return "";
    }
}