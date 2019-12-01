package pratice;

public class stringRotation {


//	    boolean isRotation(String s1, String s2) {
//	        if (s1 == null || s2 == null) return false;
//	        if (s1.length() != s2.length()) return false;
//	        return isSubstring(s1 + s1, s2);
//	    }
//
//	    private boolean isSubstring(String s1, String s2) {
//	        return s1.contains(s2);
//	    }
//}
//	
	public boolean isRotation(String str1, String str2) {
		if(str1 == null|| str2 == null)
		return false;
		if(str1.length() != str2.length()) return false;
		
		return isSubstring(str1, str1+str2);
	}
		
	private boolean isSubstring(String str1, String str2) {
		return str1.contains(str2);

	}
	}


