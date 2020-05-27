//Stock span problem using hashmap
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int i,j,k,l,m;
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    
	    for(i=0;i<n;i++){
	        arr[i] = sc.nextInt();
	    }
	    int count;
	    Map<Integer,Integer> hmap = new HashMap<Integer,Integer>();
	    for(i=n-1;i>=0;i--){
	        count = 1;
	        for(j=i-1;j>=0;j--){
	            if(arr[i] > arr[j]){
	                count++;
	            }
	        }
	        hmap.put(arr[i],count);
	    }
	    for(i=0;i<n;i++){
	        if(hmap.containsKey(arr[i])){
	            System.out.println(hmap.get(arr[i]));
	        }
	    }

        }
	}


