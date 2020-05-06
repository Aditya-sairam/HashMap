//Get the destination city-java program

class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String,String> hmap = new HashMap<String,String>();
        
        int i;
        for(i=0;i<paths.size();i++){
            hmap.put(paths.get(i).get(0),paths.get(i).get(1));
        }
        String des  = hmap.keySet().iterator().next();
        while(hmap.get(des)!=null) {
            des = hmap.get(des);
        }        
        return des;
        
    }
}
