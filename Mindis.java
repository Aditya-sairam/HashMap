//Finding the minimum distance between two same elements in java.
//1 2 3 2 1-here distance between 2's is 2 and 1's is 4 so 2 is printed as o/p

class Mindis
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
	            currind = i;
	            prev = hmap.get(arr[i]);
	            mindis = Math.min(currind-prev,mindis);
	        }
	        hmap.put(arr[i],i);
	    }
	    
	    System.out.print(mindis);
	}
}
