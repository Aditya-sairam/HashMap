//Finding the maximum frequency element using hashmap 
import java.util.Map.Entry; 

class Consequtive {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int i,j,m,count;
        int result=0;
        Map<Integer,Integer> hmap = new HashMap<Integer,Integer>();
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
        int max_count = 0;
        int res = -1;
         for(Entry<Integer, Integer> val : hmap.entrySet()) 
         {
             if(max_count < val.getValue()){
                 res = val.getKey();
                 max_count = val.getValue();
             }
         }
        return res;
}
}
