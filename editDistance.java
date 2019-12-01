package pratice;
import java.util.List;
public class editDistance {
	
public static boolean isOneEditAway(String input1, String input2){
	if(input1==null || input2 ==null) {
	return false;
	}
	if (input1.length() == input2.length()) {
		return isReplaceEdit(input1, input2);
	} else if (input1.length() == input2.length() + 1) {
		/* Bigger string is the first parameter to this method */
		return isRemovalEdit(input1, input2);
	} else if (input1.length() + 1 == input2.length()) {
		return isRemovalEdit(input2, input2);
	}
	return false;
}

private static boolean isReplaceEdit(String input1, String input2) {
	int i = 0;
	int editCount = 0;
	/* Loop till the length of small string */
	while (i < input1.length()) {
		/* If character's doesn't match, increase the 
		 * edit count and move forward, else just move forward. */
		if (input1.charAt(i) != input2.charAt(i)) {
			editCount++;
			i++;
		} 
		i++;
	}
	/* We should be either 0 or 1 edits away */
	return editCount <= 1;
}

private static boolean isRemovalEdit(String input1, String input2) {
	int removalCount = 0;
	/* We need two pointers here, because both the strings are of different length */
	int i = 0, j = 0;
	while (i < input2.length()) {
		/* If characters doesn't match, we know first string has a character to remove.
		 * Jump the pointer just for first string and increase removal count */
		if (input1.charAt(i) != input2.charAt(j)) {
			removalCount++;
			i++;
		} 
		/* Move forward for both strings */
		i++;
		j++;
	}
	/* We should be either 0 or 1 removals away */
	return removalCount <= 1;
}


		
		
	}


