
package pratice;
import java.util.Arrays;
public class anagram {
	//Given two strings s and t , write a function to determine if t is an anagram of s.

	//An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

	//example1:
	/* Input: s = "anagram", t = "nagaram"
	Output: true */

	//example2:
	/* Input: s = "rat", t = "car"
	Output: false*/

	    public boolean isAnagram(String s, String t) {
	      if(s.length() != t.length()){
	        return false;
	      }
	      char[] s1 = s.toCharArray();
	      char[] t1 = t.toCharArray();
	      
	       Arrays.sort(s1);
	       Arrays.sort(t1);
	      
	        for(int i= 0; i< t1.length; i++){
	          if(s1[i] != t1[i]){
	            return false;
	          }
							    }
	    	return true;
	}
}
