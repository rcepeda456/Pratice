package pratice;

public class sumOfTwoArrays {
	// Class name must be "Main"
	// Libraries included:
	// json simple, guava, apache commons lang3, junit, jmock
	// [5, -1, 2, 0, 10]
	// [3, 2, -9, 5, 1]
	// [8, 1, -7, 5, 11]

	
	    public static void main(String[] args) {
	        int [] a= {5, -1, 2, 0, 10};
	        int [] b= { 3, 2, -9, 5, 1} ; 
	        int [] sums = new int [a.length];
	        for(int i=0; i<a.length; i++){
	       int x= a[i];
	 
	       int y= b[i];
	            
	         int sum = x+y;
	         
	            sums[i]= sum;
	           
	            
	        
	        }
	        for(int i=0; i<sums.length; i++){
	           System.out.println(sums[i]);
	    }
	}

	}
