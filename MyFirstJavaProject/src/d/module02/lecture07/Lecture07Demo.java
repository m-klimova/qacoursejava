package d.module02.lecture07;

class Lecture07Demo {

	public static void main(String[] args) {
		
		//String reverted = reverseString("this is test string to reverse");
		//System.out.println(reverted);
		
		//System.out.println(reverseString("this is test string to reverse"));
		
		// System.out.println(factorial(-1));
		// System.out.println(factorialRecursion(5));
		
		// System.out.println(fibonacci(6));
		
		double[] myArray = {8.5, 3.4, 8, 2.3, 45.23, 0.3};
		System.out.println(findMaxInArray(myArray));

		//arrOfArrs();
	}
	
	//access return-type name-method(parameters) { body of method}
	  static String reverseString(String myString) {
		  // local variable for the method to tore the result
		  String result = "";
		  // length = 10, to charAt(9) = posledniqt simvol
		  for(int i = myString.length() - 1; i >= 0; i--) {
			  result = result + myString.charAt(i);
		  }
		  
		  return result;
	  }

	// 5! = 5 * 4 * 3 * 2 * 1
	  // 5! = 5 * 4!
	  // 5! = 5 * (5 - 1)!
	// 0! = 1
	static int factorial(int n) {
		
		if(n < 0) {
			System.out.println("I expect a positive int.\n");
			return 0;
		}
		
		int result = 1;
		
		for(int i = 1; i <= n; i++) 
			result = result * i;
		
		return result;
	}
	
	// Recursion: when a method calls itself
	// remember: base (dyno) of recursion
	static int factorialRecursion(int n) {
		if(n == 0) return 1;
		else
			return(n * factorialRecursion(n - 1));
	}
	
	//      0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 .......
	// pos: 0, 1, 2, 3, 4, 5 .......
	static int fibonacci(int n) {
		int first = 0;
		int second = 1;
		int current;
		
		if(n == 0) return first;
		for(int position = 2; position <= n; position++) {
			current = first + second;
			// 1st iteration: cur = 0 + 1;
			// 2nd iteration: cur = 1 + 1
			first = second;
			// 1st iteration: first = 1
			// 2nd iteration: first = 1;
			second = current;
			// 1st iteration: second = 1
			// 2nd iteration: second = 2
		}
		
		return second;
		
	}
	
	static double findMaxInArray(double[] array) {
	      double max = array[0];
	      for (int i = 1; i <= array.length; i++) {
	         if (array[i] > max) 
	        	 max = array[i];
	      }
	      
	      return max;
	}
	
	static void arrayTest() {
		String[] myArrOfString;
		String arrOfStrings[];
		String[] newArr = new String[10];
		int[] arrOfInt = new int[6];
		
		int[] test = {2, 3, 57, 345, 21321, 3, 0};
		
	}
	
	static void arrOfArrs() {
		int myArr[][]= new int[2][3];
	    int i, j;
	    int k = 0;
	    for(i = 0; i < 2; i++) {
	       for(j = 0; j < 3; j++) {
	    	   myArr[i][j] = k;
	    	   k++;
	       }
	    }
	    
	    /*
	     * |1|2|3|
	     * |3|4|5|
	     *
	     * |dj|jds|ksjdj| 
	     */
	    
	    for(i = 0; i < 2; i++) {
	    	for(j = 0; j < 3; j++) {
	    		System.out.print(myArr[i][j] + " ");
	       }
	    }
	}

}
