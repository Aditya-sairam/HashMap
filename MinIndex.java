//Minimum difference between indeces of array of similar elements

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MinIndex
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int n,m;
	    n = sc.nextInt();
	    m = sc.nextInt();
	    String[] arr1 = new String[n];
	    String[] arr2 = new String[m];
	    int i,j;
	    for(i=0;i<n;i++){
	        arr1[i] = sc.nextLine();
	    }
	    for(i=0;i<m;i++){
	        arr2[i] = sc.nextLine();
	    }
	    Map<String,Integer> hmap = new HashMap<String,Integer>();
	    
	    for(i=0;i<n;i++){
	        hmap.put(arr1[i],i);
	    }
	    for(j=0;j<m;j++){
	        String key = arr2[j];
	        if(hmap.containsKey(key)){
	            int freq = hmap.get(key);
	            freq = freq + j;
	            hmap.put(key,freq);
	    }
	    else{
	        hmap.remove(key);
	    }
	    }
	    for (String name: hmap.keySet()){
            String key = name;
            int value = hmap.get(name);  
            System.out.println(key + " " + value);  
} 
	
}
}
