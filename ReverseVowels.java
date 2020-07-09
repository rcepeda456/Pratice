package pratice;

	//Write a function that takes a string as input and reverse only the vowels of a string.

	/* Example 1:
	Input: "hello"
	Output: "holle"
	*/

	/* 
	Example 2:
	Input: "leetcode"
	Output: "leotcede"
	*/  
	public class ReverseVowels {
	 	public String reverse(String s){
	    String vowels = "aeiouAEIOU";
	    char[] s1 = s.toCharArray();
	    int start = 0; //first pointer 
	    int end = s1.length-1; //last pointer array
		while(start < end){
	    
	    while(start < end && !vowels.contains(s1[start]+"")){
	    	start++;
	    }
	    
	    while(start < end && !vowels.contains(s1[end]+"")){
	    	end--;
	    }
	    
	    
	    //reverse element
	    char temp = s1[start];
	    s1[start] = s1[end];
	    s1[end] = temp;
	    
	    
	    //increment, decrement 
	    start++;
	    end--;

	 }
	
	 	
	}
	}
