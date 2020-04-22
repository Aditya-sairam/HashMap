//Finding the frequency of eah element in java using hashmap
class Frequency
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    int i;
	    int mindis = Integer.MAX_VALUE;
	    for(i=0;i<n;i++){
	        arr[i] = sc.nextInt();
	    }
	    int currind,prev;
	    
	    HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
	    
	    for(i=0;i<n;i++){
	        if(hmap.containsKey(arr[i])){
	            hmap.put(arr[i],hmap.get(arr[i])+1);
	        }
	        else{
	        hmap.put(arr[i],1);
	        }
	    }
	     for (Map.Entry entry : hmap.entrySet()) { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        } 
	}
}
