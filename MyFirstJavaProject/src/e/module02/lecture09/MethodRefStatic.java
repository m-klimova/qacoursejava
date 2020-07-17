package e.module02.lecture09;

/*
 * Example of method reference to static method
 */

@FunctionalInterface
interface ArraySize {
	int countArrayElements(Object[] objArray);
}

public class MethodRefStatic {

	public static int countElements(Object[] array) {
		return array.length;
	}
	
	public static void main(String[] args) {
		Integer[] intArray = { 3, 5, 20, 2, 90, 43, 2 };
		
		ArraySize arrSize = MethodRefStatic::countElements;
		System.out.println(arrSize.countArrayElements(intArray));
	}
}