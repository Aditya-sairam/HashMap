import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TripletSum
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int sum = sc.nextInt();
	    int[] arr = new int[n];
	    int i,j,k,l;
	    
	    int flag = 0;
	    
	    for(i=0;i<n;i++){
	        arr[i] = sc.nextInt();
	    }
	    Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	    for(i=0;i<n;i++){
	        map.put(arr[i],i);
	    }
	    for(i=0;i<n;i++){
	        for(j=i+1;j<n;j++){
	            int value = sum - (arr[i]-arr[j]);
	            if(map.containsKey(value)){
	                if(map.get(value) != i && map.get(value) != j){
	                    flag += 1;
	                }
	               
	        }
	    }

	}
	if(flag == 0){
	    System.out.print("False");
	}
	else{
	    System.out.print("True");
	}
}
}
