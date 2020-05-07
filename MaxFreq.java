//Finding all the elements that are greater floor(n/3) times using hashmap
import java.util.Map.Entry; 
class MaxFreq {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        
        int n = nums.length;
        int i,j;
        
        for(i=0;i<n;i++){
            int key = nums[i];
            if(hmap.containsKey(key)){
                int freq = hmap.get(key);
                freq++;
                hmap.put(key,freq);
            }
            else{
                hmap.put(key,1);
            }
        }
        List<Integer> lis = new ArrayList<Integer>();
        double max_count = Math.floor(n/3);
        int res = -1;
        for(Entry<Integer, Integer> val : hmap.entrySet()) {
            if(max_count < val.getValue()){
                res = val.getKey();
                //max_count = val.getValue();
                lis.add(res);
            } 
        }
        
        return lis;
    }
}
