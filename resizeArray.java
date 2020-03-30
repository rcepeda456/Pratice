package pratice;

public static String[] resizeArray(String[] arrayToResize) {

int newCapacity = arrayToResize.length * 2;

String[] newArray = new String[newCapacity];

 

System.arraycopy(arrayToResize, 0,

newArray, 0, arrayToResize.length);

return newArray;

}
}