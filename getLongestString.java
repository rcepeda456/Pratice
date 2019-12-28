package pratice;

public static void main(String[] args) {
    String[] input = {"i", "am", "an", "array", "this", "is", "the", "largest", "string"};
    System.out.println(getLongestString(input));  // should print "largest"
  }
  
  public static String getLongestString(String[] arr) {
    // write code in here...
    
    String largest = arr[0]; // "i"
    for(int i =0; i<arr.length-1; i++){
      // i == arr[i]
      String next = arr[i+1];
     if(largest.length() < next.lenght()){
				largest = next;
       
       
      
     }
      
    }
    return largest;
  }

}
