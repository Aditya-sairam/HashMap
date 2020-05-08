//Find the k Weakest rows in a matrix usings hashmap

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int k = sc.nextInt();
	    int mat[][] = new int[n][n];
	    int i,j;
	    for(i=0;i<n;i++){
	        for(j=0;j<n;j++){
	            mat[i][j] = sc.nextInt();
	        }
	    }
	    Map<Integer,Integer> hmap = new HashMap<Integer,Integer>();
	    
	    for(i=0;i<n;i++){
	        int sum = 0;
	        for(j=0;j<n;j++){
	            sum += mat[i][j];
	        }
	        hmap.put(sum,i);
	    }
	    TreeMap<Integer,Integer> tmap = new TreeMap<Integer,Integer>();
	    tmap.putAll(hmap);
	    
	    Set<Integer> setKeys = new HashSet<>(tmap.values());
        
        //convert it to a List using the constructor and pass the key set
        List<Integer> listKeys = new ArrayList<Integer>( setKeys );
        
        
      Collection<Integer> values = hmap.values(); 
         
//Creating an ArrayList of values 
         
        ArrayList<Integer> listOfValues = new ArrayList<Integer>(values);
         //for (Integer num : listOfValues) { 		      
          //System.out.println(num); 		
      //}
      for(int p=0;p<k;p++){
          System.out.println(listOfValues.get(p));
      }
        
      int arr[] = new int[100];
      int ind = 0;
	    for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
            int key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key, " + key + " value " + value);
            arr[ind++] = value;
	    }
    //for(int l=0;l<k;l++){
      //  System.out.println(arr[i]);
    //}
	}
	
}
