package e.module02.lecture09;

import java.util.Arrays;

public class MethodRefClass {
	   public static void main(String[] args) {  
		String[] stringArray = { "aa", "bb", "cc", "dd", "ff"};
		/* Method reference to an instance method of an arbitrary 
		 * object of a particular type
		 */
		Arrays.sort(stringArray, String::compareToIgnoreCase);
		for(String str: stringArray){
			System.out.println(str);
	   }  
	}
}
