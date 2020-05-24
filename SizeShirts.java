package pratice;
//Sort the size shirts from Small to Medium to Large
//Example :LLMSMS  OUTPUT: SSMMLL
import java.util.HashMap;

public class SizeShirts {
	public static void main(String[] args) {
	
		String T = "LLLLLSM";
		 
	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

	hm.put('S', 0);
	hm.put('M', 0);
	hm.put('L', 0);
//added Keys of S, M & L. Started the value at 0

	// SMS = SSM
	for(int i =0; i<T.length(); i++) {
//created a variable currentChar to get the cuurent Character at i
		 char currentChar = T.charAt(i);
		 int count = hm.get(currentChar);
//variable count = to currentChar which was the Key. this line of code gives
		 //us the value of S,M,& L
		 hm.put(currentChar, count + 1);
// ADDED THE COUNT BY 1 DEPENDING ON HOW MANY TIMES WE SEE THE currentChar
		 
	}

	String sort = "";
// for loop hm.get gets the value of S and adds how many S's we have to 
	// the empty String sort
	for(int i=0; i <hm.get('S'); i++){
		sort += 'S';
	}
	// for loop hm.get gets the value of M and adds how many M's we have to 
		// the empty String sort
	for(int i=0; i <hm.get('M'); i++){
		sort += 'M';
	}
	// for loop hm.get gets the value of L and adds how many L's we have to 
		// the empty String sort
	for(int i=0; i <hm.get('L'); i++){
		sort += 'L';
	}
	
	System.out.print(sort);
	}

	
	
}

