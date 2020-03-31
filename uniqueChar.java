package pratice;
import java.util.*; 

/*Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures? */

public class uniqueChar {


		
		 boolean uniqueCharacters(String str) 
		    { 
		        char[] chArray = str.toCharArray(); 

		
		   Arrays.sort(chArray); 
		   
	        for (int i = 0; i < chArray.length - 1; i++) { 
	            // if the adjacent elements are not 
	            // equal, move to next element 
	            if (chArray[i] != chArray[i + 1]) 
	                continue; 
	  
	            // if at any time, 2 adjacent elements 
	            // become equal, return false 
	            else
	                return false; 
	        } 
	        return true; 
	    } 
	  
}