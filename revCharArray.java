package pratice;
//Write a function that reverses a string. The input string is given as an array of characters char[].

//Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
//You may assume all the characters consist of printable ascii characters.

 //example: 
/* Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"] */

//example 2:
/*Input: ["h","a","n","n","a","H"]
Output: ["h","a","n","n","a","H"] */
//"r" "a" "y" "m" "o" "n" "d" : length = 7 = 7/2 = 3

//"h" -"H" -> "H"
//"H" - > "H" 

public class revCharArray {
	  public void reverseString(char[] s) {
	    //two varibles , i and j, i equal to s.length and j = to s.length-1, j= s
	    int j = s.length - 1;
	    for(int i =0; i<s.length/2; i++, j--){
	      char temp = s[i];
	       s[i]= s[j];
	       s[j]= temp;
	  
	    }
	}

}
